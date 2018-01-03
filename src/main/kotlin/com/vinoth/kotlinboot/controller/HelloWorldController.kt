package com.vinoth.kotlinboot.controller

import com.vinoth.kotlinboot.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @Autowired
    lateinit var employeeService: EmployeeService

    @GetMapping("/hello/{name}")
    fun helloWorld(@PathVariable("name") name: String) = "Hello $name"

}