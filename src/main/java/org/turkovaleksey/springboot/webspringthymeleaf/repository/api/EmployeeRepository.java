package org.turkovaleksey.springboot.webspringthymeleaf.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.springboot.webspringthymeleaf.repository.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
