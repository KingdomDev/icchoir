package fr.icchoirlyon.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAllPersons() {
        //System.out.println("Before finding all persons");
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person findPerson(Long id) {
        return personRepository.getOne(id);
    }
}
