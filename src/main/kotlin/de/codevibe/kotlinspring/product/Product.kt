package de.codevibe.kotlinspring.product

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Product(
    @Id @GeneratedValue val id: Long = 0,
    val code: String,
    val title: String,
)
