package com.vinoth.kotlinboot.controller

import com.vinoth.kotlinboot.model.Employee
import com.vinoth.kotlinboot.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService

    @PostMapping("/employee")
    fun createEmployee(@RequestBody e: Employee) = employeeService.createEmployee(e)

    @GetMapping("/employee/{id}")
    fun getEmployee(@PathVariable("id") id: Int) = employeeService.getEmployee(id)


    @GetMapping("/employee")
    fun getEmployees(@RequestParam("minSalary" , required = false) minSalary: Double? = null)
            = employeeService.getEmployees(minSalary)
}