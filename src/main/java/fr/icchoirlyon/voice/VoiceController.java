package fr.icchoirlyon.voice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoiceController {
    @Autowired
    private VoiceService voiceService;

    @RequestMapping(value = "/voices", method = RequestMethod.GET)
    @ResponseBody
    public List<Voice> getAllVoices() {
        return voiceService.listAllVoices();
    }
}
