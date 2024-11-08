package com.example.se331_lab.rest.controller;
import org.springframework.stereotype.Controller;
import com.example.se331_lab.rest.entity.Event;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {
    List<Event> eventList;
    @PostConstruct
    public void init() {
        eventList = new ArrayList<>();
        eventList.add(Event.builder()
                .id(123L)
                .category("animal welfare")
                .title("Cat Adoption Day")
                .description("Find your new feline friend at this event.")
                .location("Meow Town")
                .date("January 28, 2022")
                .time("12:00")
                .petAllowed(true)
                .organizer("Kat Laydee")
                .build());
        eventList.add(Event.builder()
                .id(456L)
                .category("food")
                .title("Community Gardening")
                .description("Join us as we tend to the community edible plants.")
                .location("Flora City")
                .date("March 14, 2022")
                .time("10:00")
                .petAllowed(true)
                .organizer("Fern Pollin")
                .build());
        eventList.add(Event.builder()
                .id(789L)
                .category("environment")
                .title("Tree Planting Day")
                .description("Help plant trees and improve our local environment.")
                .location("Green Park")
                .date("April 22, 2022")
                .time("09:00")
                .petAllowed(false)
                .organizer("Eco Friends")
                .build());

        eventList.add(Event.builder()
                .id(101L)
                .category("education")
                .title("Science Fair")
                .description("Explore the wonders of science with hands-on activities.")
                .location("Tech High School")
                .date("May 15, 2022")
                .time("14:00")
                .petAllowed(false)
                .organizer("Science Club")
                .build());

        eventList.add(Event.builder()
                .id(112L)
                .category("health")
                .title("Health Fair")
                .description("Free health check-ups and wellness workshops.")
                .location("Community Center")
                .date("June 10, 2022")
                .time("10:00")
                .petAllowed(false)
                .organizer("Health Department")
                .build());

        eventList.add(Event.builder()
                .id(134L)
                .category("arts")
                .title("Art Exhibition")
                .description("Enjoy a variety of art pieces from local artists.")
                .location("City Gallery")
                .date("July 20, 2022")
                .time("18:00")
                .petAllowed(true)
                .organizer("Art Society")
                .build());

    }
}
