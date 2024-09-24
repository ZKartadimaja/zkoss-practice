package com.fif.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.fif.model.Person;


public class PersonRepository {
    public static List<Person> personList = new ArrayList<Person>();

    static {
        personList.add(
                new Person(1,
                        "azkaban",
                        "aselole",
                        "Azkaban Aselole",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(2000, 8,13)),
                        "West Java",
                        "Bandung",
                        10)
        );
        personList.add(
                new Person(2,
                        "luna",
                        "moonlight",
                        "Luna Moonlight",
                        "Female",
                        java.sql.Date.valueOf(LocalDate.of(1995, 5, 22)),
                        "Central Java",
                        "Semarang",
                        25));
        personList.add(
                new Person(3,
                        "thor",
                        "hammer",
                        "Thor Hammer",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1988,8,15)),
                        "East Java",
                        "Surabaya",
                        42)
        );
        personList.add(
                new Person(4,
                        "maria",
                        "rose",
                        "Maria Rose",
                        "Female",
                        java.sql.Date.valueOf(LocalDate.of(1992,5,12)),
                        "Bali",
                        "Denpasar",
                        33)
        );
        personList.add(
                new Person(5,
                        "gandalf",
                        "wizard",
                        "Gandalf The Wizard",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1980,1,1)),
                        "West Nusa Tenggara",
                        "Mataram",
                        5)
        );
        personList.add(
                new Person(6,
                        "hermione",
                        "granger",
                        "Hermione Granger",
                        "Female",
                        java.sql.Date.valueOf(LocalDate.of(1996,9,19)),
                        "Jakarta",
                        "Jakarta",
                        8)
        );

        personList.add(
                new Person(7,
                        "sauron",
                        "darklord",
                        "Sauron the Dark Lord",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1990,10,30)),
                        "Yogyakarta",
                        "Yogyakarta",
                        18)
        );

        personList.add(
                new Person(8,
                        "neville",
                        "longbottom",
                        "Neville Longbottom",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1997,7,17)),
                        "Banten",
                        "Serang",
                        3)
        );

        personList.add(
                new Person(9,
                        "daenerys",
                        "targaryen",
                        "Daenerys Targaryen",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1985,3,26)),
                        "Sumatra",
                        "Medan",
                        99)
        );
        personList.add(
                new Person(10,
                        "frodo",
                        "baggins",
                        "Frodo Baggins",
                        "Male",
                        java.sql.Date.valueOf(LocalDate.of(1994,9,22)),
                        "Aceh",
                        "Banda Aceh",
                        21)
        );
    }
        public List<Person> findAll(){
            return personList;
        }

//        public List<Person> addUser(){
//            return personList;
//        }
}