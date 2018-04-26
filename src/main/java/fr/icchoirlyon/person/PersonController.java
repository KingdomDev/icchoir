package fr.icchoirlyon.person;

import com.codahale.metrics.annotation.Timed;
import fr.icchoirlyon.modele.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/persons")
    @Timed
    public List<Person> getAllPersons() {
        return personService.listAllPersons();
    }
}
