package fr.icchoirlyon.voice;

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
