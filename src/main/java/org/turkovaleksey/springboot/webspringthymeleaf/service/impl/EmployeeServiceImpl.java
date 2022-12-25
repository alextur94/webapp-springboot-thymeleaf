package org.turkovaleksey.springboot.webspringthymeleaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.springboot.webspringthymeleaf.repository.api.EmployeeRepository;
import org.turkovaleksey.springboot.webspringthymeleaf.repository.model.Employee;
import org.turkovaleksey.springboot.webspringthymeleaf.service.api.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Employee entity) {employeeRepository.save(entity);}

    @Override
    public Employee getByID(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
