package fr.icchoirlyon.media;

import com.codahale.metrics.annotation.Timed;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class MediaController {
    @Inject
    MediaService mediaService;

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/medias")
    @Timed
    Page<Media> getAllMedias() {
        return mediaService.getAllMedias();
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/medias/{type}")
    @Timed
    List<Media> getAllMediasByType(@PathVariable String type) {
        return mediaService.getAllMediasByType(type);
    }
}
