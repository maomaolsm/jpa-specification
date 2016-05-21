package com.example.service;

import com.example.controller.domain.PersonDTO;

/**
 * Created by maomao on 16/3/22.
 */
public interface PersonService{
    PersonDTO findOne(Long id);
}

