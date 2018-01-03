package com.vinoth.kotlinboot.service

import com.vinoth.kotlinboot.model.Employee
import org.springframework.stereotype.Service

@Service
class EmployeeService {


    companion object {
        val employeeDB = mutableMapOf(1 to Employee(1,"Vinoth","HR", 300.0),
                2 to Employee(1,"Vinoth","HR", 300.0) )
    }


    fun createEmployee(employee: Employee) = employeeDB.put(employee.id, employee)

    fun getEmployees() = employeeDB
}
