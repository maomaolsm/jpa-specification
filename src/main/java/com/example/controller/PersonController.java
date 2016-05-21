package com.example.controller;

import com.example.controller.domain.PersonDTO;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET)
    public List<PersonDTO> findByName(@RequestParam String name) {
        return  personService.findByName(name);
    }
}
