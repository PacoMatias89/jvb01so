package org.hackaboss.c5d6ejercicio1.controller;

import org.hackaboss.c5d6ejercicio1.dto.RatingDto;
import org.hackaboss.c5d6ejercicio1.model.Rating;
import org.hackaboss.c5d6ejercicio1.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {


    @Autowired
   RatingService ratingService;

    @GetMapping("/{numRegistration}")
    public List<Rating> getRatingsNumRegistration(@PathVariable Long numRegistration) {
        return ratingService.getRatingsNumRegistration(numRegistration);
    }

    @GetMapping("/descending")

    public List<RatingDto> getRatingOrderDescending() {
        return ratingService.getRatingOrderDescending();
    }

}
