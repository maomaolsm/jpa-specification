package com.example.service;

import com.example.controller.domain.PersonDTO;

import java.util.List;

/**
 * Created by maomao on 16/3/22.
 */
public interface PersonService{
    PersonDTO findOne(Long id);
    List<PersonDTO> findByName(String name);
}

