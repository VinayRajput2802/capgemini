package com.hackerrank.stereotypes.controller;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.service.ContactService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@RestController
public class ContactController {
    ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/contact/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        Person saved = contactService.save(person);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);

    }

    @GetMapping("/contact/retrieve/{id}")
    public ResponseEntity<Person> retrieve(@PathVariable int id){
        Person person = contactService.retrieve(id);
        return new ResponseEntity<>(person, HttpStatus.OK);

    }
}
