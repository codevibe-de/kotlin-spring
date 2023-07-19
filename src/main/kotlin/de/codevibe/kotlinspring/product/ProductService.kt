package de.codevibe.kotlinspring.product

import de.codevibe.kotlinspring.common.error.NotFoundException

class ProductService(
    private val productRepository: ProductRepository,
) {
    fun createProduct(code: String = "", title: String): Product =
        productRepository.save(
            Product(code = code, title = title)
        )

    fun getProductByCode(code: String): Product =
        productRepository.findByCode(code)
            ?: throw NotFoundException("Product with code $code")

    fun getAllProducts() = productRepository.findAll()
}

