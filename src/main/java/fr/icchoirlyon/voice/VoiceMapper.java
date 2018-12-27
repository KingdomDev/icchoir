package fr.icchoirlyon.voice;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author François Dona Samaké
 */
//@Mapper
@Service
public class VoiceMapper {
    VoiceDTO fromVoice(Voice voice) {
        VoiceDTO result = new VoiceDTO();
        result.description = voice.getDescription();
        result.type = voice.getType();

        return result;
    }
}
