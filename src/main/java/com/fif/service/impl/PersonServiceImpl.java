package com.fif.service.impl;

import com.fif.model.Person;
import com.fif.repository.PersonRepository;
import com.fif.service.PersonService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    //Data Model
    private List<Person> personList;
    private PersonRepository repository = new PersonRepository();
    //    private static int id = 1;

    public PersonServiceImpl() {
        personList = repository.findAll();
    }

    public List<Person> findAll() {
        return personList;
    }

    public List<Person> search(String keyword) {
        List<Person> result = new LinkedList<Person>();
        if (keyword == null || keyword.isEmpty()) {
            result = personList;
        } else {
            for (Person p : personList) {
                if (p.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(p);
                }
                else if (p.getGender().equalsIgnoreCase(keyword)) {
                    result.add(p);
                }
                else if (p.getBirthdayDate().equals(keyword)) {
                    result.add(p);
                }
            }
        }
        return result;
    }
}


