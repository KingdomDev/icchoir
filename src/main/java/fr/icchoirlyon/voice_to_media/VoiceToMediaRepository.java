package fr.icchoirlyon.voice_to_media;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoiceToMediaRepository extends CrudRepository<VoiceToMedia, Long> {
    List<VoiceToMedia> findAll();

    @Query("select distinct vtm " +
            "from VoiceToMedia vtm " +
            "inner join vtm.voice vtm_voice " +
            "where vtm_voice.id = :voiceId")
    List<VoiceToMedia> findAllByVoiceId(@Param("voiceId") Long voiceId);

    @Query("select distinct vtm " +
            "from VoiceToMedia vtm " +
            "inner join vtm.media vtm_media " +
            "where vtm_media.id = :mediaId")
    List<VoiceToMedia> findAllByMediaId(@Param("mediaId") Long mediaId);
}
