package fr.icchoirlyon.service;

import fr.icchoirlyon.dao.PersonRepository;
import fr.icchoirlyon.modele.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> listAllPersons() {
        //System.out.println("Before finding all persons");
        return personRepository.findAll();
    }
}
