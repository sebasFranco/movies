package com.ceiba.movies.aplication.caseuse;

import org.springframework.stereotype.Service;

import com.ceiba.movies.aplication.command.MovieCommand;
import com.ceiba.movies.domain.model.Movie;
import com.ceiba.movies.domain.ports.MovieRepository;

@Service
public class SaveMovieService {
	
	private MovieRepository movieRepository;

	public SaveMovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public Movie saveMovie(MovieCommand movieCommand) {
		Movie movie = new Movie(movieCommand.getId(), movieCommand.getTitle(), movieCommand.getSynopsis());
		movieRepository.saveMovie(movie);
		return movie;
	}
}
