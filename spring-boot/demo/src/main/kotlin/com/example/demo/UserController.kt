package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/users")
    fun users(): List<User> = listOf(
        User(1, "Ryu", "Kitakyushu"),
        User(2, "Maki", "Fukuoka"),
        User(3, "Saku", "Tokyo")
    )
}