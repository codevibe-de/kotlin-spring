package de.codevibe.kotlinspring.product

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductRestController {

    @RequestMapping("/products", method = [RequestMethod.GET])
    fun getAllProducts(): List<Product> {
        return listOf()
    }
}