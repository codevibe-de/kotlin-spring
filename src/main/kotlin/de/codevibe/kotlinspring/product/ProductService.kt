package de.codevibe.kotlinspring.product

import de.codevibe.kotlinspring.common.error.NotFoundException
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Qualifier

class ProductService(
    @Qualifier("greeting") private val greeting: String,
    private val productRepository: ProductRepository,
) {
    @PostConstruct
    fun postConstruct() {
        println(greeting)
    }

    fun createProduct(code: String="", title:String) =
        productRepository.save(
            Product(code = code, title = title)
        )

    fun getProductByCode(code:String): Product =
        productRepository.findByCode(code) ?: throw NotFoundException("Product with code $code")
}

