package com.vinoth.kotlinboot.service

import org.springframework.stereotype.Service

@Service
class EmployeeService {

    val employeeMap = hashMapOf(1 to "Vinoth", 2 to "Mark", 3 to "Steve")

    fun getEmployees() = employeeMap
}
