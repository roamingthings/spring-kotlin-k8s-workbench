package de.roamingthings.kuberspring.orderservice.model

import javax.persistence.*

@Entity
@Table(name = "ORDER_TABLE")
data class Order(
    @Id
    @GeneratedValue
    var id: Long? = null,

    @Column(length = 160)
    var name: String
)
