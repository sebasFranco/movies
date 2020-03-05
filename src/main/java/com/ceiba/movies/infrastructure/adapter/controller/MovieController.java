package com.ceiba.movies.infrastructure.adapter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.movies.aplication.caseuse.FindAllMoviesService;
import com.ceiba.movies.aplication.caseuse.FindMovieByIdService;
import com.ceiba.movies.aplication.caseuse.SaveMovieService;
import com.ceiba.movies.aplication.command.MovieCommand;
import com.ceiba.movies.domain.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	private FindAllMoviesService findAllMoviesService;
	private FindMovieByIdService findMovieByIdService;
	private SaveMovieService saveMovieService;

	public MovieController(FindAllMoviesService findAllMoviesService, FindMovieByIdService findMovieByIdService,
			SaveMovieService saveMovieService) {
		this.findAllMoviesService = findAllMoviesService;
		this.findMovieByIdService = findMovieByIdService;
		this.saveMovieService = saveMovieService;
	}
	
	@GetMapping
	public List<Movie> findAllMovies(){
		return findAllMoviesService.findAllMovies();
	}
	
	@GetMapping("{id}")
	public Movie findMovieById(@PathVariable Long id) {
		return findMovieByIdService.findMovieById(id);
	}
	
	 @PostMapping
	 public Movie saveMovie(@RequestBody MovieCommand movieCommand) {
		 return saveMovieService.saveMovie(movieCommand);
	 }
	
}
