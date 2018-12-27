package fr.icchoirlyon.voice_to_media;

import fr.icchoirlyon.media.MediaDTO;
import fr.icchoirlyon.voice.VoiceDTO;

import java.io.Serializable;

public class VoiceToMediaDTO implements Serializable {
    private VoiceDTO voice;
    private MediaDTO media;
    private String  url;

    public VoiceDTO getVoice() {
        return voice;
    }

    public void setVoice(VoiceDTO voice) {
        this.voice = voice;
    }

    public MediaDTO getMedia() {
        return media;
    }

    public void setMedia(MediaDTO media) {
        this.media = media;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
