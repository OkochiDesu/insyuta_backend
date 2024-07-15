package com.insyuta.backend.api.customer.controller

import com.insyuta.backend.api.customer.dto.GetCustomerResponse
import com.insyuta.backend.api.customer.service.GetCustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GetCustomerController(
  private val getCustomerService: GetCustomerService,
) {

  @GetMapping("/customer")
  fun getCustomers(): String {
    val customer: GetCustomerResponse = getCustomerService.getCustomers()
    return customer.toString()
  }
}
