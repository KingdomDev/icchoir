package fr.icchoirlyon.event;

import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class EventController {
    @Inject
    EventService eventService;

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/events")
    @Timed
    List<EventDTO> getEvents() {
        return eventService.listAllEvents();
    }
}
