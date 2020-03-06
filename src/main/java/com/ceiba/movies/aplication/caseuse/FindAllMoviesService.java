package com.ceiba.movies.aplication.caseuse;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ceiba.movies.domain.model.Movie;
import com.ceiba.movies.domain.ports.MovieRepository;

@Service
public class FindAllMoviesService {
	
	private MovieRepository movieRepository;

	public FindAllMoviesService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> findAllMovies(){
		return movieRepository.findAllMovies();
	}
	
}
