package com.alassaneniang.payrollspringreactjs.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String description;

}
