package fr.icchoirlyon.instrument;

import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstrumentController {
    @Autowired
    private InstrumentService instrumentService;

    @GetMapping("/instruments")
    @Timed
    public List<Instrument> getAllInstruments() {
        return instrumentService.listAllInstruments();
    }
}
