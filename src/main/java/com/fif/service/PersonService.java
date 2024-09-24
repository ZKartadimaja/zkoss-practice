package com.fif.service;

import com.fif.model.Person;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Collection<? extends Person> search(String keyword);

    void deletePerson(String id);

    void add(String id, String username, String password, String fullName, String gender, Date birthdayDate, String province, String city, int luckyNumber);

    Person getById(String id);

    void saveUser(Person user);

    void updateUser(Person user);
}
