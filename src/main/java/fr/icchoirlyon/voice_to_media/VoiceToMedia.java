package fr.icchoirlyon.voice_to_media;

import fr.icchoirlyon.media.Media;
import fr.icchoirlyon.voice.Voice;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "voice_to_media")
public class VoiceToMedia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Voice voice;

    @ManyToOne
    private Media media;

    @Column
    private String url;

    public Long getId() {
        return id;
    }

    @JoinColumn(name = "idVoice")
    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    @JoinColumn(name = "idMedia")
    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoiceToMedia that = (VoiceToMedia) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(voice, that.voice) &&
                Objects.equals(media, that.media) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, voice, media, url);
    }
}
