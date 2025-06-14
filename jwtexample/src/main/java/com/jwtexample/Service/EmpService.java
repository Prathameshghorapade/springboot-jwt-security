package com.jwtexample.Service;


import com.jwtexample.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {

    private List<Employee> allEmployee = new ArrayList<>();

    public EmpService() {
        allEmployee.add(new Employee("pratham","pratu@gmail","pratu","aa"));
        allEmployee.add(new Employee("rutu","pratu@gmail","pratu","aa"));
        allEmployee.add(new Employee("pp","pratu@gmail","pratu","aa"));
    }

    public List<Employee> getAllEmployee(){
        return this.allEmployee;
    }
}
