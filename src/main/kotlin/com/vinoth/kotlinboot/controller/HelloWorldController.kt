package com.vinoth.kotlinboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
class HelloWorldController {


    @GetMapping("/hello/{name}")
    fun helloWorld(@PathVariable ("name") name : String ) : String {
        return "Hello $name"
    }

}