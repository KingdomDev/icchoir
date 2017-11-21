package fr.icchoirlyon.dao;

import fr.icchoirlyon.modele.Voice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoiceRepository extends CrudRepository<Voice, Long> {
    List<Voice> findAll();
}
