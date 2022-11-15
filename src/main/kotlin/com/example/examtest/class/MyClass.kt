package com.example.examtest.`class`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MyClass {

    @GetMapping("/api/test")
    fun myString(): String {
        return "APP is RUnning"

    }
}