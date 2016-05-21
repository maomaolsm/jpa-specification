package com.example.service.impl;

import com.example.controller.domain.PersonDTO;
import com.example.persistence.PersonRepository;
import com.example.service.PersonService;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maomao on 16/5/20.
 */
@Service
public class PersonServiceImlp implements PersonService{

    @Autowired
    PersonRepository personRepository;

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    @Override
    public PersonDTO findOne(Long id) {
        return mapperFactory.getMapperFacade().map(personRepository.findOne(id), PersonDTO.class);
    }
}
