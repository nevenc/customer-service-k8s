package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class Customer {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    
}
