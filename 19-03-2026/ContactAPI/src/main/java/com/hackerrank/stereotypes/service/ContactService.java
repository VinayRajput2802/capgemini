package com.hackerrank.stereotypes.service;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ContactService {
    ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Person retrieve(Integer id){
        return contactRepository.findById(id).get();

    }

    public Person save(Person person){
        return contactRepository.saveAndFlush(person);
    }
}
