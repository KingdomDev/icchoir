package fr.icchoirlyon.event;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service
public class EventMapper {
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    public EventDTO eventToEventDTO(Event event) {
        EventDTO result = new EventDTO();

        result.setId(event.getId());
        result.setDate(df.format(event.getStartDate()));
        result.setTitle(event.getTitle());
        result.setDesc(event.getDescription());

        return result;
    }
}
