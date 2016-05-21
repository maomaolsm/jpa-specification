package com.example.service.impl;

import com.example.controller.domain.PersonDTO;
import com.example.persistence.PersonRepository;
import com.example.persistence.domain.PersonDAO;
import com.example.service.PersonService;
import com.example.utils.Criteria;
import com.example.utils.Restrictions;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<PersonDTO> findByName(String name) {

        Criteria<PersonDAO> criteria = new Criteria<>();
        criteria.add(Restrictions.eq("name", name, true));
        List<PersonDAO> personDAOList = personRepository.findAll(criteria);
        List<PersonDTO> personDTOList = new ArrayList<>();

        for (PersonDAO personDAO:personDAOList){
            PersonDTO personDTO=mapperFactory.getMapperFacade().map(personDAO, PersonDTO.class);
            personDTOList.add(personDTO);
        }

        return personDTOList;
    }


}
