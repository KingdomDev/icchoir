package fr.icchoirlyon.controller;

import fr.icchoirlyon.modele.Person;
import fr.icchoirlyon.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value="/persons", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getAllPersons(Model model) {
        //model.addAttribute("persons", personService.listAllPersons());
        //return "persons";
        return personService.listAllPersons();
    }
}
