package com.insyuta.backend.api.customer.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GetCustomerController {

    @GetMapping("/customer")
    fun getCustomers(): String {
        val name = "World"
        val greeting = "Hello"
        return "$greeting, $name!"
    }
}
