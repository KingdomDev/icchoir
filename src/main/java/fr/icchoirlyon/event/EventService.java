package fr.icchoirlyon.event;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class EventService {
    @Inject
    EventRepository eventRepository;

    @Inject
    EventMapper eventMapper;

    public List<EventDTO> listAllEvents(){
        List<Event> events = eventRepository.findAll();

        return events.stream()
                .map(eventMapper::eventToEventDTO)
                .collect(toList());
    }
}
