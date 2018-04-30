package fr.icchoirlyon.voice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoiceRepository extends CrudRepository<Voice, Long> {
    List<Voice> findAll();
}
