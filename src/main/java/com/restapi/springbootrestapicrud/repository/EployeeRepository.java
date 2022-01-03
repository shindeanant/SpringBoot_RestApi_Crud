package com.restapi.springbootrestapicrud.repository;

import com.restapi.springbootrestapicrud.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EployeeRepository extends CrudRepository<Employee, Integer> {

}
