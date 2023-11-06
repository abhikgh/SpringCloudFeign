package com.example.SpringCloudFeign.service;

import com.example.SpringCloudFeign.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class FallbackService implements RestFeignService{

    @Override
    public Movie getMovieDetailsFeign(Integer movieId) {
        return new Movie(1,"test", "test", "test","test","1990", false);
    }
}
