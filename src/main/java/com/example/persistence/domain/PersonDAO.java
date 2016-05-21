package com.example.persistence.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by maomao on 16/4/1.
 */
@Data
@Entity(name = "person")
public class PersonDAO{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
