package com.sjp.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sjp.moviecatalogservice.model.CatalogItem;
import com.sjp.moviecatalogservice.model.Movie;
import com.sjp.moviecatalogservice.model.Rating;
import com.sjp.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		//return Collections.singletonList(new CatalogItem("m1", "desc", 4));
		
//		List<Rating> ratings = Arrays.asList(
//				new Rating("1", 4),
//				new Rating("2", 5)
//				);
		
		UserRating u = restTemplate.getForObject("http://rating-data-service/ratingsdata/user/"+userId, UserRating.class);
		return u.getRatings().stream().map(
				rating -> {
					Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(), "desc", rating.getRating());
				}
				).collect(Collectors.toList());
	}
}
