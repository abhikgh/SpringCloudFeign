package com.example.SpringCloudFeign.service;

import com.example.SpringCloudFeign.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "SpringBootREST2", url = "http://localhost:9050")
public interface RestFeignService {

    @GetMapping(value = "/orders/v1/getMovieDetails/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Movie getMovieDetailsFeign(@PathVariable("movieId") Integer movieId);

}
