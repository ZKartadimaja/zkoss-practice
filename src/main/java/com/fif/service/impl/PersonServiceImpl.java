package com.fif.service.impl;

import com.fif.model.Person;
import com.fif.repository.PersonRepository;
import com.fif.service.PersonService;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    //Data Model
    private List<Person> personList = PersonRepository.personList;
//    private PersonRepository repository = new PersonRepository();
    //    private static int id = 1;

//    public PersonServiceImpl() {
//        personList = repository.findAll();
//    }

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

    @Override
    public void deletePerson(String id){
        personList.removeIf(person -> person.getId().equals(id));
    }
    @Override
    public void add(String id, String username, String password, String fullName, String gender, Date birthdayDate, String province, String city, int luckyNumber) {
        personList.add(new Person(id, username, password, fullName, gender, birthdayDate, province, city, luckyNumber));
    }

    @Override
    public Person getById(String id) {
        for (Person user : personList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void saveUser(Person user) {
        personList.add(user);
        return;
    }
    @Override
    public void updateUser(Person user) {
        this.deletePerson(user.getId());
        this.saveUser(user);
        return;
    }
}


