package com.example.sbet.bootingweb.services;

import com.example.sbet.bootingweb.models.Employee;
import com.example.sbet.bootingweb.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(UUID.randomUUID().toString(), "Jorge", "Lameiro", Position.SECURITY));
        employees.add(new Employee(UUID.randomUUID().toString(), "Bryana", "Morales", Position.FRONT_DESK));
        employees.add(new Employee(UUID.randomUUID().toString(), "Bryam", "Morales", Position.CONCIERGE));
    }

    public List<Employee> getAllEmployees() { return employees; }
}
