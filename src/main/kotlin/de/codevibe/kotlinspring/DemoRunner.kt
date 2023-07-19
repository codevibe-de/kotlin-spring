package de.codevibe.kotlinspring

import de.codevibe.kotlinspring.product.ProductService
import org.springframework.boot.CommandLineRunner

class DemoRunner(private val productService: ProductService) : CommandLineRunner {

    override fun run(vararg args: String?) {
        productService.createProduct(title = "Pizza Grande", code = "P001")
        productService.createProduct(title = "Pizza Speciale", code = "P002")
        println(productService.getProductByCode("P002"))
    }

}
