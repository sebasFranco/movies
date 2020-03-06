package com.ceiba.movies.aplication.caseuse;

import org.springframework.stereotype.Service;

import com.ceiba.movies.domain.model.Movie;
import com.ceiba.movies.domain.ports.MovieRepository;

@Service
public class FindMovieByIdService {

	private MovieRepository movieRepository;

	public FindMovieByIdService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public Movie findMovieById(Long id) {
		return movieRepository.findMovieById(id);
	}
	
}
