package com.example.SpringCloudFeign;

import com.example.SpringCloudFeign.model.Movie;
import com.example.SpringCloudFeign.service.RestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignApplication implements CommandLineRunner{

	@Autowired
	private RestFeignService restFeignService;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Movie movie = restFeignService.getMovieDetailsFeign(100);
		System.out.println(movie);
	}
}
