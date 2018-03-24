package de.roamingthings.kuberspring.orderservice.service

import de.roamingthings.kuberspring.orderservice.model.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>
