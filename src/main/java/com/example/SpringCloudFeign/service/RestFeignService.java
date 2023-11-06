package com.example.SpringCloudFeign.service;

import com.example.SpringCloudFeign.config.CloudConfig;
import com.example.SpringCloudFeign.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "SpringBootREST2", url = "http://localhost:9050/orders/v1", configuration = CloudConfig.class)
public interface RestFeignService {

    @GetMapping(value = "/getMovieDetails/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
    Movie getMovieDetailsFeign(@PathVariable("movieId") Integer movieId);

}

