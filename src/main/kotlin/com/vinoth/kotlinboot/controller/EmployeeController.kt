package com.vinoth.kotlinboot.controller

import com.vinoth.kotlinboot.model.Employee
import com.vinoth.kotlinboot.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService

    @PostMapping("/employee")
    fun createEmployee(@RequestBody e: Employee) = employeeService.createEmployee(e)

    @GetMapping("/employees")
    fun getEmployees() = employeeService.getEmployees()
}