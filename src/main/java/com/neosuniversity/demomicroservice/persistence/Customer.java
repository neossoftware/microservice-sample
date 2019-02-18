package com.neosuniversity.demomicroservice.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "customer")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private Integer id;
    private String name;
    private String address;
}
