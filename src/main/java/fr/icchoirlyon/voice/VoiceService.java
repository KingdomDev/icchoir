package fr.icchoirlyon.voice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoiceService {
    @Autowired
    private VoiceRepository voiceRepository;

    public List<Voice> getAllVoices() {
        return voiceRepository.findAll();
    }
}
