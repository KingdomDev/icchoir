package fr.icchoirlyon.voice_to_media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VoiceToMediaController {
    @Autowired
    VoiceToMediaService vtmService;

    @GetMapping("/voice-to-medias")
    @ResponseBody
    public List<VoiceToMedia> getAllVoiceToMedias() {
        return vtmService.getAllVoiceToSongs();
    }

    @GetMapping("/voice-to-medias/voice/{voiceId}")
    @ResponseBody
    public List<VoiceToMedia> getVoiceToMediasByVoiceId(@PathVariable("voiceId") Long voiceId) {
        return vtmService.getVoiceToSongsByVoiceId(voiceId);
    }

    @GetMapping("/voice-to-medias/media/{mediaId}")
    @ResponseBody
    public List<VoiceToMedia> getVoiceToMediasByMediaId(@PathVariable("mediaId") Long mediaId) {
        return vtmService.getVoiceToSongsByMediaId(mediaId);
    }
}
