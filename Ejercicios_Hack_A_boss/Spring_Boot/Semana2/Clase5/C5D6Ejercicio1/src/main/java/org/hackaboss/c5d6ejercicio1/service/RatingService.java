package org.hackaboss.c5d6ejercicio1.service;

import org.hackaboss.c5d6ejercicio1.dto.RatingDto;
import org.hackaboss.c5d6ejercicio1.model.Rating;
import org.hackaboss.c5d6ejercicio1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class RatingService  implements IRatingService {

    @Autowired
    StudentService studentService;
    List<Rating> ratings;

    @Autowired
    public RatingService(StudentService studentService) {
        this.studentService = studentService;
        initializeRatings();
    }

    private void initializeRatings() {
        ratings = Arrays.asList(
                new Rating(1L, 6.5, 5.5, 7.3, getAverageRating(6.5, 5.5, 7.3), studentService.getAllStudents().stream().filter(student -> student.getNumRegistration().equals(1L)).toList()),
                new Rating(2L, 4.75, 6.45, 8.5, getAverageRating(4.75, 6.5, 8.5),  studentService.getAllStudents().stream().filter(student -> student.getNumRegistration().equals(2L)).toList()),
                new Rating(3L, 7.75, 8.0, 10.0, getAverageRating(7.75, 8.0, 10), studentService.getAllStudents().stream().filter(student -> student.getNumRegistration().equals(3L)).toList()),
                new Rating(4L, 9.45, 7.75, 10.0, getAverageRating(9.45, 7.75, 10.0),  studentService.getAllStudents().stream().filter(student -> student.getNumRegistration().equals(4L)).toList())
        );
    }





    @Override
        public List<Rating> getRatingsNumRegistration(Long numRegistration) {
            return ratings.stream()
                    .filter(rating -> rating.getStudents().stream()
                            .anyMatch(student -> student.getNumRegistration().equals(numRegistration)))
                    .map(rating -> {
                        Rating filteredRating = new Rating();
                        filteredRating.setId(rating.getId());
                        filteredRating.setRating1(rating.getRating1());
                        filteredRating.setRating2(rating.getRating2());
                        filteredRating.setRating3(rating.getRating3());
                        filteredRating.setAverageRating(rating.getAverageRating()); // Mantenemos el promedio de la calificación
                        filteredRating.setStudents(rating.getStudents().stream()
                                .filter(student -> student.getNumRegistration().equals(numRegistration))
                                .toList());
                        return filteredRating;
                    })
                    .toList();
        }

    @Override
    public List<RatingDto> getRatingOrderDescending() {
        return ratings.stream()
                .map(rating -> {
                    RatingDto ratingDto = new RatingDto();
                    ratingDto.setId(rating.getId());
                    ratingDto.setName(studentService.getAllStudents().stream().findFirst().map(Student::getName).orElse(null));
                    ratingDto.setAverageRating(rating.getAverageRating()); // Mantenemos el promedio de la calificación
                    return ratingDto;
                }).sorted(Comparator.comparing(RatingDto::getAverageRating).reversed())//Ordenamos de manera descendente
                .toList();
    }


    //creamos el promedio de nota
    public Double getAverageRating(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return Math.round(average * 100.0) / 100.0; // Redondear a dos decimales
    }

}
