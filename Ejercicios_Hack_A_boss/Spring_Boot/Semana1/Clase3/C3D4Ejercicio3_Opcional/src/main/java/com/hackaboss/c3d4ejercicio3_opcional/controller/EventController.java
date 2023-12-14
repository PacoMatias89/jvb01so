package com.hackaboss.c3d4ejercicio3_opcional.controller;

import com.hackaboss.c3d4ejercicio3_opcional.exception.EventNotFoundException;
import com.hackaboss.c3d4ejercicio3_opcional.model.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventController {
    List<Event> events = new ArrayList<>();
    int id = 1;

    //I create an event
    @PostMapping
    public String createEvent(@RequestBody Event event) {
        events.add(new Event(id++, event.getTitle(), event.getDescription(),event.getDate(), event.getHour(), event.getLocation(), event.getTeacher()));
        return "The "+ event.getTitle() +" has been created successfully";
    }

    // I get event by id
    @GetMapping("/{id}")
    public ResponseEntity<Object> getEventById(@PathVariable int id) {
        // Check if the event exists
        if (events.stream().noneMatch(e -> e.getId() == id)) {
            String errorMessage = "Event with ID " + id + " not found";
            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
        }

        Event foundEvent = events.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        return new ResponseEntity<>(foundEvent, HttpStatus.OK);
    }

    // I get all events
    @GetMapping("/eventos")
    public List<Event> getAllEvents() {
        return events;
    }





}
