package com.jwtexample.Controller;

import com.jwtexample.Model.Employee;
import com.jwtexample.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController

public class Controller {

    @Autowired
  private   EmpService empService;

    @GetMapping("/emp")
    public List<Employee> getAllEmp(){
        return empService.getAllEmployee();
    }

    @GetMapping("current-user")
    public String getCurrentUser(Principal principal){
        return  principal.getName();
    }
}
