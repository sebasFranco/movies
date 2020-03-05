package com.ceiba.movies.domain.ports;

import java.util.List;

import com.ceiba.movies.domain.model.Movie;

public interface MovieRepository {
	
	List<Movie> findAllMovies();
	
	Movie findMovieById(Long id);
	
	void saveMovie(Movie movie);
}
