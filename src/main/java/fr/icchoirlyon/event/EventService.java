package fr.icchoirlyon.event;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class EventService {
    @Inject
    EventRepository eventRepository;

    public List<Event> listAllEvents(){
        return eventRepository.findAll();
    }
}
