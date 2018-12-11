package fr.icchoirlyon.voice_to_media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VoiceToMediaService {
    @Autowired
    VoiceToMediaRepository vtmRepository;

    @Transactional
    List<VoiceToMedia> getAllVoiceToSongs() {
        return vtmRepository.findAll();
    }

    @Transactional
    List<VoiceToMedia> getVoiceToSongsByVoiceId(Long voiceId) {
        return vtmRepository.findAllByVoiceId(voiceId);
    }

    @Transactional
    List<VoiceToMedia> getVoiceToSongsByMediaId(Long mediaId) {
        return vtmRepository.findAllByMediaId(mediaId);
    }
}
