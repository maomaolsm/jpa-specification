package com.example.controller;

import com.example.controller.domain.PersonDTO;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maomao on 16/4/1.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    protected PersonService personService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PersonDTO findById(@PathVariable Long id) {
        return  personService.findOne(id);
    }
}
