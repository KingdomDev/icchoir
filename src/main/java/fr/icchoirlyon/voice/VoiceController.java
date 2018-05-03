package fr.icchoirlyon.voice;

import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VoiceController {
    @Autowired
    private VoiceService voiceService;

    @GetMapping("/voices")
    @Timed
    public List<Voice> getAllVoices() {
        return voiceService.listAllVoices();
    }
}
