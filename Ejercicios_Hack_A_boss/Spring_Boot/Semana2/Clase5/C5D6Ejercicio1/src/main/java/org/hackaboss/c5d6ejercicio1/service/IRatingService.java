package org.hackaboss.c5d6ejercicio1.service;

import org.hackaboss.c5d6ejercicio1.dto.RatingDto;
import org.hackaboss.c5d6ejercicio1.model.Rating;

import java.util.List;

public interface IRatingService {

    public List<Rating> getRatingsNumRegistration(Long numRegistration);

    public List<RatingDto> getRatingOrderDescending();


}
