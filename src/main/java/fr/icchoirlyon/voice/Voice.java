package fr.icchoirlyon.voice;

import fr.icchoirlyon.voice_to_media.VoiceToMedia;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "voice")
public class Voice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "voice")
    private Set<VoiceToMedia> voiceToMedia;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<VoiceToMedia> getVoiceToMedia() {
        return voiceToMedia;
    }
}
