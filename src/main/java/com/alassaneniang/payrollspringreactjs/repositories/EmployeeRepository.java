package com.alassaneniang.payrollspringreactjs.repositories;

import com.alassaneniang.payrollspringreactjs.domains.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
