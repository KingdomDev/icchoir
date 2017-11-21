package fr.icchoirlyon.service;

import fr.icchoirlyon.dao.VoiceRepository;
import fr.icchoirlyon.modele.Voice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VoiceServiceImpl implements VoiceService {
    @Autowired
    private VoiceRepository voiceRepository;

    @Override
    public List<Voice> listAllVoices() {
        return voiceRepository.findAll();
    }
}
