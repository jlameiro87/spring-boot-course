package com.example.sbet.bootingweb.data;

import com.example.sbet.bootingweb.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
