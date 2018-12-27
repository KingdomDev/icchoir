package fr.icchoirlyon.media;

import com.codahale.metrics.annotation.Timed;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MediaController {
    @Inject
    MediaService mediaService;

    @GetMapping("/medias")
    @Timed
    List<MediaDTO> getAllMedias() {
        return mediaService.getAllMedias();
    }

    @GetMapping("/medias/{type}")
    @Timed
    List<MediaDTO> getAllMediasByType(@PathVariable String type) {
        return mediaService.getAllMediasByType(type);
    }
}
