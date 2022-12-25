package org.turkovaleksey.springboot.webspringthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.springboot.webspringthymeleaf.repository.model.Employee;
import org.turkovaleksey.springboot.webspringthymeleaf.service.impl.EmployeeServiceImpl;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
//    private EmployeeRepository employeeRepository;
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping({ "/", "/list"})
    public ModelAndView showEmployees() {
        ModelAndView modelAndView = new ModelAndView("list-employees");
//        List<Employee> list = employeeRepository.findAll();
        List<Employee> list = employeeServiceImpl.getAll();
        modelAndView.addObject("employees", list);
        return modelAndView;
    }

    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeFrom() {
        ModelAndView modelAndView = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        modelAndView.addObject("employee", newEmployee);
        return modelAndView;
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
//        employeeRepository.save(employee);
        employeeServiceImpl.saveOrUpdate(employee);
        return "redirect:/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long employeeId) {
        ModelAndView modelAndView = new ModelAndView("add-employee-form");
//        Employee actualEmployee = employeeRepository.findById(employeeId).get();
        Employee actualEmployee = employeeServiceImpl.getByID(employeeId);
        modelAndView.addObject("employee", actualEmployee);
        return modelAndView;
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Long employeeId){
        employeeServiceImpl.deleteById(employeeId);
        return "redirect:/list";
    }

}
