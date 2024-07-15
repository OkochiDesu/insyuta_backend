package com.insyuta.backend.api.customer.service

import com.insyuta.backend.api.customer.dto.GetCustomerResponse
import com.insyuta.backend.api.customer.entity.CustomerEntity
import com.insyuta.backend.api.customer.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class GetCustomerService(
  private val customerRepository: CustomerRepository,
) {
  fun getCustomers(): GetCustomerResponse {
    val customer: CustomerEntity = customerRepository.findCustomerById(1)
    return GetCustomerResponse(
      id = customer.id.toString(),
      name = customer.name,
      email = customer.email,
    )
  }
}
