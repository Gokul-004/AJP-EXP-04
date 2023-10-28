package com.exp4.exp4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class Controller {
    private static List<Employee> emp = new ArrayList<Employee>();

    @GetMapping
    public List<Employee> disp1() {
        return emp;
    }

    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        emp.add(employee);
        return (com.exp4.exp4.Employee) emp;
    }
}
