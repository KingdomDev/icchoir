package fr.icchoirlyon.voice;

import fr.icchoirlyon.voice_to_media.VoiceToMedia;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "voice")
public class Voice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "voice", cascade = CascadeType.ALL)
    private List<VoiceToMedia> voiceToMedia;

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

    public List<VoiceToMedia> getVoiceToMedia() {
        return voiceToMedia;
    }
}
