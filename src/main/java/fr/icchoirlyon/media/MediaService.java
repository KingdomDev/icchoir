package fr.icchoirlyon.media;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
public class MediaService {
    @Inject
    MediaRepository mediaRepository;

    @Transactional
    Page<Media> getAllMedias() {
        return mediaRepository.findAllTop10(new PageRequest(0, 10));
    }

    @Transactional
    List<Media> getAllMediasByType(String type) {
        return mediaRepository.findAllByType(type);
    }
}
