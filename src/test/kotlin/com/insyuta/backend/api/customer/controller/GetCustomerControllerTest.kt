package com.insyuta.backend.api.customer.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(SpringExtension::class)
@SpringBootTest
@AutoConfigureMockMvc
class GetCustomerControllerTest {

  @Autowired
  private lateinit var mockMvc: MockMvc

  @Test
  fun `test getCustomers endpoint`() {
    mockMvc.perform(get("/customer"))
      .andExpect(status().isOk)
    // Add more assertions as needed
  }
}
