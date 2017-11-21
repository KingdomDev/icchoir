package fr.icchoirlyon.controller;

import fr.icchoirlyon.modele.Instrument;
import fr.icchoirlyon.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentController {
    @Autowired
    private InstrumentService instrumentService;

    @RequestMapping(value = "/instruments", method = RequestMethod.GET)
    @ResponseBody
    public List<Instrument> getAllInstruments() {
        return instrumentService.listAllInstruments();
    }
}
