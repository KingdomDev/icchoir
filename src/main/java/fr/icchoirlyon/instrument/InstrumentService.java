package fr.icchoirlyon.instrument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentService {
    @Autowired
    private InstrumentRepository instrumentRepository;

    public List<Instrument> listAllInstruments() {
        return instrumentRepository.findAll();
    }
}
