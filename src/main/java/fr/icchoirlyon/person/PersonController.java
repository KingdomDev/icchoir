package fr.icchoirlyon.person;

import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;

    //GET_MAPPINGS -----------------------------------------------------------------------------------------------------
    @GetMapping("/persons")
    @Timed
    public List<Person> getAllPersons() {
        return personService.findAllPersons();
    }

    @GetMapping("/persons/{id}")
    @Timed
    public Person getPerson(@PathVariable Long id) {
        return personService.findPerson(id);
    }

    //POST_MAPPINGS ----------------------------------------------------------------------------------------------------
    @PostMapping("/persons")
    @Timed
    public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person) throws URISyntaxException {
        System.out.println("Creating" + person);
        if(person.getId() != null) {
            return ResponseEntity.badRequest().body(null);
        }

        Person result = personService.save(person);
        if(result != null){
            return ResponseEntity.created(new URI("/persons/" + result.getId()))
                    .body(result);
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
    }
}
