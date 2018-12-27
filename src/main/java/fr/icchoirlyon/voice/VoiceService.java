package fr.icchoirlyon.voice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoiceService {
    @Autowired
    private VoiceRepository voiceRepository;

    @Autowired
    private VoiceMapper voiceMapper;

    public List<VoiceDTO> getAllVoices() {
        return voiceRepository.findAll()
                .stream().map(voiceMapper::fromVoice)
                .collect(Collectors.toList());
    }
}
