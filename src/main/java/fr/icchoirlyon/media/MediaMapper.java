package fr.icchoirlyon.media;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
//@Mapper(componentModel = "spring")
public class MediaMapper {
    /*@Mappings({
            @Mapping(target="id",
                   expression = "java( UUID.nameUUIDFromBytes((media.getName()+ media.getType()).getBytes()).toString() )"),
            @Mapping(target="voiceToMedias",
                    expression = "media.getVoiceToMedias()\n" +
                    "                .stream()\n" +
                    "                .map(vtm -> vtm.getUrl())\n" +
                    "                .collect(Collectors.toList())")
    })
    MediaDTO fromMedia(Media media);*/

    public MediaDTO fromMedia(Media media) {
        MediaDTO result = new MediaDTO();
        result.setId(UUID.nameUUIDFromBytes((media.getName()+ media.getType()).getBytes()).toString());
        result.setName(media.getName());
        result.setType(media.getType());
        result.setUrl(media.getUrl());
        result.setCreationDate(media.getCreationDate());
        result.setDescription(media.getDescription());
        result.setVoiceToMedias(media.getVoiceToMedias()
                .stream()
                .map(vtm -> vtm.getUrl())
                .collect(Collectors.toList()));

        return result;
    }
}
