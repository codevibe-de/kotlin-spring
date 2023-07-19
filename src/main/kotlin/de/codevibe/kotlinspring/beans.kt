package de.codevibe.kotlinspring

import de.codevibe.kotlinspring.product.ProductService
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

val myBeans = beans {
    bean<String>("greeting") { "Hello there!"}
    bean<ProductService>()
    bean<DemoRunner>()
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) =
        myBeans.initialize(context)
}