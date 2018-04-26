package fr.icchoirlyon.person;

import fr.icchoirlyon.person.PersonRepository;
import fr.icchoirlyon.modele.Person;
import fr.icchoirlyon.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> listAllPersons() {
        //System.out.println("Before finding all persons");
        return personRepository.findAll();
    }
}
