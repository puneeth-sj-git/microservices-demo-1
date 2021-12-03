package com.sjp.moviecatalogservice.model;

public class Movie {
		private String movieId;
		private String name;
		public String getMovieId() {
			return movieId;
		}
		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Movie(String movieId, String name) {
			super();
			this.movieId = movieId;
			this.name = name;
		}
		/* without default constructor, we get below exception while runtime -
		 * 
		com.fasterxml.jackson.databind.exc.InvalidDefinitionException: 
		Cannot construct instance of `com.sjp.moviecatalogservice.model.Movie` 
		(no Creators, like default constructor, exist): 
		cannot deserialize from Object value (no delegate- or property-based Creator)
 		at [Source: (PushbackInputStream); line: 1, column: 2]
		 */
		public Movie() {
			
		}

}
