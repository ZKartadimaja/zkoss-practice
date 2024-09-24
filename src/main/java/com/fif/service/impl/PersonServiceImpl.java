package com.fif.service.impl;

import com.fif.model.Person;
import com.fif.service.PersonService;

import java.util.LinkedList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    //Data Model
    public List<Person> personList = new LinkedList<Person>();

    private static int id = 1;

    public PersonServiceImpl() {
        personList.add(
                new Person(id++,
                        "azkaban",
                        "aselole",
                        "Azkaban Aselole",
                        "Male",
                        "13-09-2000",
                        "West Java",
                        "Bandung",
                        "10")
        );
        personList.add(
                new Person(id++,
                        "luna",
                        "moonlight",
                        "Luna Moonlight",
                        "Female",
                        "22-05-1995",
                        "Central Java",
                        "Semarang",
                        "25"));
        personList.add(
                new Person(id++,
                        "thor",
                        "hammer",
                        "Thor Hammer",
                        "Male",
                        "15-08-1988",
                        "East Java",
                        "Surabaya",
                        "42")
        );
        personList.add(
                new Person(id++,
                        "maria",
                        "rose",
                        "Maria Rose",
                        "Female",
                        "05-12-1992",
                        "Bali",
                        "Denpasar",
                        "33")
        );
        personList.add(
                new Person(id++,
                        "gandalf",
                        "wizard",
                        "Gandalf The Wizard",
                        "Male",
                        "01-01-1980",
                        "West Nusa Tenggara",
                        "Mataram",
                        "5")
        );
        personList.add(
                new Person(id++,
                        "hermione",
                        "granger",
                        "Hermione Granger",
                        "Female",
                        "19-09-1996",
                        "Jakarta",
                        "Jakarta",
                        "8")
        );

        personList.add(
                new Person(id++,
                        "sauron",
                        "darklord",
                        "Sauron the Dark Lord",
                        "Male",
                        "30-10-1990",
                        "Yogyakarta",
                        "Yogyakarta",
                        "18")
        );

        personList.add(
                new Person(id++,
                        "neville",
                        "longbottom",
                        "Neville Longbottom",
                        "Male",
                        "17-07-1997",
                        "Banten",
                        "Serang",
                        "3")
        );

        personList.add(
                new Person(id++,
                        "daenerys",
                        "targaryen",
                        "Daenerys Targaryen",
                        "Female",
                        "26-03-1985",
                        "Sumatra",
                        "Medan",
                        "99")
        );
        personList.add(
                new Person(id++,
                        "frodo",
                        "baggins",
                        "Frodo Baggins",
                        "Male",
                        "22-09-1994",
                        "Aceh",
                        "Banda Aceh",
                        "21")
        );
    }

    public List<Person> findAll() {
        return personList;
    }

    public List<Person> search(String keyword) {
        List<Person> result = new LinkedList<Person>();
        if (keyword == null || "".equals(keyword)) {
            result = personList;
        } else {
            for (Person p : personList) {
                if (p.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(p);
                }
            }
        }
        return result;
    }
}


