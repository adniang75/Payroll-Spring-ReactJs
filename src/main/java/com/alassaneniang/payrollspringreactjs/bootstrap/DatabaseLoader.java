package com.alassaneniang.payrollspringreactjs.bootstrap;

import com.alassaneniang.payrollspringreactjs.domains.Employee;
import com.alassaneniang.payrollspringreactjs.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j( topic = "bootstrap" )
@RequiredArgsConstructor
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Override
    public void run ( String... args ) {
        repository.save( new Employee( "Frodo", "Baggins", "ring bearer" ) );
        repository.save( new Employee( "Bilbo", "Baggins", "burglar" ) );
        repository.findAll().forEach( employee ->
                log.info( "Preloaded " + employee ) );

    }
}
