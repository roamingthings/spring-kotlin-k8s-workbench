package de.roamingthings.kuberspring.orderservice.service

import de.roamingthings.kuberspring.orderservice.model.Order
import org.springframework.stereotype.Service
import java.util.*

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun save(order: Order): Order {
        return orderRepository.save(order)
    }

    fun retrieveAll(): List<Order> {
        return orderRepository.findAll()
    }

    fun findById(id: Long): Optional<Order> {
        return orderRepository.findById(id)
    }
}
