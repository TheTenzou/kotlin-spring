package ru.thetenzou.boston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class HelloWorldController {

    @GetMapping("hello")
    fun helloWorld(): String = "Hello, this is REST endpoint!"
}