package com.vinoth.kotlinboot.service

import com.vinoth.kotlinboot.model.Employee
import org.springframework.stereotype.Service
import reactor.core.publisher.toFlux
import reactor.core.publisher.toMono

@Service
class EmployeeService {


    companion object {
        val employeeDB = mutableMapOf(1 to Employee(1,"Vinoth","HR", 300.0),
                2 to Employee(2,"Mark","Finance", 1200.0) )
    }

    fun createEmployee(employee: Employee) = employeeDB.put(employee.id, employee)

    fun getEmployee(id : Int)  = employeeDB[id].toMono()

    fun getEmployees(minSalary : Double?)
            = employeeDB.values.toFlux()
            .filter{
                it.salary >= minSalary?: Double.MIN_VALUE
            }
}
