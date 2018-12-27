package fr.icchoirlyon.media;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MediaDTO implements Serializable {
    private String id;
    private String name;
    private String type;
    private String description;
    private String url;
    private Date creationDate;
    private List<String> voiceToMedias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<String> getVoiceToMedias() {
        return voiceToMedias;
    }

    public void setVoiceToMedias(List<String> voiceToMedias) {
        this.voiceToMedias = voiceToMedias;
    }
}
