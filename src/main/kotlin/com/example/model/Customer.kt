package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)
val customerStorage = mutableListOf<Customer>(
    Customer("1", "Albert", "Adehe", "aadehe@gmail.com"),
    Customer("2", "John", "Sylvester", "jsylvester@yahoo.com")
)

