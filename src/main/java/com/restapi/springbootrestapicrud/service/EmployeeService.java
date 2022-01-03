package com.restapi.springbootrestapicrud.service;

import com.restapi.springbootrestapicrud.model.Employee;
import com.restapi.springbootrestapicrud.repository.EployeeRepository;
import com.restapi.springbootrestapicrud.serviceinterface.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements EmployeeInterface {
    @Autowired
    private EployeeRepository eployeeRepository;

    @Override
    public void saveEmp(Employee employee) {
        eployeeRepository.save(employee);


    }

    @Override
    public Employee updateEmp(Employee employee) {
        return eployeeRepository.save(employee);
    }

    @Override
    public void deleteEmp(int id) {
        eployeeRepository.deleteById(id);

    }

    @Override
    public List<Employee> getAllEmp() {
        return (List<Employee>) eployeeRepository.findAll();
    }
}