package fr.icchoirlyon.service;

import fr.icchoirlyon.dao.InstrumentRepository;
import fr.icchoirlyon.modele.Instrument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InstrumentServiceImpl implements InstrumentService {
    @Autowired
    private InstrumentRepository instrumentRepository;

    @Override
    public List<Instrument> listAllInstruments() {
        return instrumentRepository.findAll();
    }
}
