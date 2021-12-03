package com.sjp.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjp.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId1}")
	public Movie getMovieInfo(@PathVariable("movieId1") String movieId) {
		return new Movie(movieId, "m1-info");
	}
}