package com.restapi.springbootrestapicrud.controller;

import com.restapi.springbootrestapicrud.model.Employee;
import com.restapi.springbootrestapicrud.serviceinterface.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HomeController {
@Autowired
    private EmployeeInterface employeeInterface;
@PostMapping(value = "saveEmp")
public String addNewEmp(@RequestBody Employee employee) {
    System.out.println("At Controller Add");
    employeeInterface.saveEmp(employee);
    return "Added Successfully";
}
@GetMapping(value = "getEmployee")
public List<Employee> findAllSudent(){
return employeeInterface.getAllEmp();
}
@PutMapping( "updateEmp")
public Employee updateEmployee(@RequestBody Employee employee){
    return employeeInterface.updateEmp(employee);

}
@DeleteMapping(value = "deleteEmp")
public String deleteEmployee(@RequestParam int id){

    employeeInterface.deleteEmp(id);
    return "Employee deleted Successfully....";

}
}
