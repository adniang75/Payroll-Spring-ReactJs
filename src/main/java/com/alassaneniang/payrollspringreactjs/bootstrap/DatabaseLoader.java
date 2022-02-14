package com.alassaneniang.payrollspringreactjs.bootstrap;

import com.alassaneniang.payrollspringreactjs.domains.Employee;
import com.alassaneniang.payrollspringreactjs.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Override
    public void run ( String... args ) {
        repository.save( new Employee( "Frodo", "Baggins", "ring bearer" ) );
    }
}
