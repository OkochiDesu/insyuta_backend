package com.insyuta.backend.api.customer.repository

import com.insyuta.backend.api.customer.entity.CustomerEntity
import org.apache.ibatis.annotations.Mapper

@Mapper
interface CustomerRepository {
  fun findCustomerById(id: Long): CustomerEntity
}
