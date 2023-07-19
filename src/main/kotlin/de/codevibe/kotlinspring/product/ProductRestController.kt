package de.codevibe.kotlinspring.product

import de.codevibe.kotlinspring.App
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductRestController(
    private val productService: ProductService
) {

    companion object {
        const val ROOT = App.API_ROOT + "/products"
        const val PATH_GET_ALL = ROOT
        const val PATH_CREATE_ONE = ROOT
    }

    @GetMapping(PATH_GET_ALL)
    fun getAllProducts(): List<Product> = productService.getAllProducts()

    @PostMapping(PATH_CREATE_ONE)
    fun createProduct(@RequestBody data:CreateProductRequest) =
        productService.createProduct(code = data.code, title = data.title)
}

data class CreateProductRequest(
    val title:String,
    val code:String,
)