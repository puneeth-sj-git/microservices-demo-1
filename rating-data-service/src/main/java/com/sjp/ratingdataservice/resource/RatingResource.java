package com.sjp.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjp.ratingdataservice.model.Rating;
import com.sjp.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("/user/{userId}")
	public UserRating getRatings(@PathVariable String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1", 4),
				new Rating("1", 5)
				);
		
		UserRating u = new UserRating();
		u.setRatings(ratings);
		return u;
	}
}
