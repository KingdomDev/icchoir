package fr.icchoirlyon.media;

import com.codahale.metrics.annotation.Timed;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/medias")
public class MediaController {
    @Inject
    MediaService mediaService;

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/")
    @Timed
    Page<Media> getAllMedias() {
        return mediaService.getAllMedias();
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/{type}")
    @Timed
    List<Media> getAllMediasByType(@PathVariable String type) {
        return mediaService.getAllMediasByType(type);
    }
}
