package de.roamingthings.kuberspring.orderservice.controler

import de.roamingthings.kuberspring.orderservice.model.Order
import de.roamingthings.kuberspring.orderservice.service.OrderService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RequestMapping("/orders")
@Controller
class OrderController(private val orderService: OrderService) {

    @PostMapping
    fun saveOrder(@ModelAttribute order: Order): String {
        orderService.save(order)

        return "redirect:/orders"
    }

    @GetMapping
    fun listAllOrders(model: Model): String {
        val orders = orderService.retrieveAll()
        model.addAttribute("orders", orders)

        return "orders/list"
    }

    @GetMapping("/new")
    fun addOrder(model: Model): String {
        model.addAttribute("order", Order(name = ""))
        return "orders/details"
    }

    @GetMapping("/{id}")
    fun retrieveOrder(@PathVariable id: Long, model: Model): String {
        val orderCandidate = orderService.findById(id)

        if (orderCandidate.isPresent) {
            model.addAttribute("order", orderCandidate.get())
            return "orders/details"
        } else {
            return "orders/list"
        }
    }
}
