package de.codevibe.kotlinspring.product

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Product(
    @Id @GeneratedValue val id: Long = 0,
    val code: String,
    @Column(name="descr") val title: String,
)
