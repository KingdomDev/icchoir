package fr.icchoirlyon.dao;

import fr.icchoirlyon.modele.Instrument;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstrumentRepository extends CrudRepository<Instrument, Long> {
    List<Instrument> findAll();
}
