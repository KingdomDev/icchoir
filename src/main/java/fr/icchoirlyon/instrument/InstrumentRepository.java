package fr.icchoirlyon.instrument;

import fr.icchoirlyon.instrument.Instrument;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstrumentRepository extends CrudRepository<Instrument, Long> {
    List<Instrument> findAll();
}
