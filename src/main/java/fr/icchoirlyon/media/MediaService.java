package fr.icchoirlyon.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MediaService {
    @Inject
    MediaRepository mediaRepository;

    @Autowired
    MediaMapper mediaMapper;

    @Transactional
    /*Page<Media> getAllMedias() {
        return mediaRepository.findAllTop10(new PageRequest(0, 10));
    }*/
    List<MediaDTO> getAllMedias() {
        return mediaRepository.findAll()
                .stream().map(mediaMapper::fromMedia)
                .collect(Collectors.toList());
    }

    @Transactional
    List<MediaDTO> getAllMediasByType(String type) {
        return mediaRepository.findAllByType(type)
                .stream().map(mediaMapper::fromMedia)
                .collect(Collectors.toList());
    }
}
