package com.fif.service;

import com.fif.model.Person;

import java.util.Collection;

public interface PersonService {

    Collection<? extends Person> findAll();

    Collection<? extends Person> search(String keyword);
}
