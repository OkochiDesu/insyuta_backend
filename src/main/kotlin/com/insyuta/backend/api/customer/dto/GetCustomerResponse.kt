package com.insyuta.backend.api.customer.dto

data class GetCustomerResponse(
  val id: String,
  val name: String,
  val email: String,
)
