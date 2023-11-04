package com.example.SpringCloudFeign.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@JsonProperty("movieId")
	private Integer movieId;

	@JsonProperty("movieName")
	private String movieName;

	@JsonProperty("director")
	private String director;

	@JsonProperty("genre")
	private String genre;

	@JsonProperty("hero")
	private String hero;

	@JsonProperty("year")
	private String year;

	@JsonProperty("nationalAward")
	private Boolean nationalAward;
}
