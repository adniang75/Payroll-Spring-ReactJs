package com.alassaneniang.payrollspringreactjs.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee {

    @Id
    @GeneratedValue
    @Setter( AccessLevel.NONE )
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    public Employee ( String firstName, String lastName, String description ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Employee employee = (Employee) o;

        return id.equals( employee.id );
    }

    @Override
    public int hashCode () {
        return id.hashCode();
    }

}
