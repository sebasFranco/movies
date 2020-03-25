package com.ceiba.movies.infrastructure.adapter.dbpostgresql.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.springframework.stereotype.Component;

import com.ceiba.movies.domain.model.Movie;
import com.ceiba.movies.domain.ports.MovieRepository;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.jpaentiry.JpaMovie;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.jparepository.JpaMovieRepository;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.mapper.MovieMapper;
import com.ceiba.movies.infrastructure.adapter.rabbitmq.SendMessage;

@Component
public class PostgresqlMovieRepository implements MovieRepository{
	
	private SendMessage sendMessage;
	JpaMovieRepository jpaMovieRepository;

	public PostgresqlMovieRepository(JpaMovieRepository jpaMovieRepository) {
		this.jpaMovieRepository = jpaMovieRepository;
	}

	@Override
	public List<Movie> findAllMovies() {
		List<Movie> movies = new ArrayList<>();
		List<JpaMovie> jpaMovies = jpaMovieRepository.findAll();
		jpaMovies.forEach(value-> movies.add(MovieMapper.entityToDomain(value)));
		return movies;
	}

	@Override
	public Movie findMovieById(Long id) {
		return MovieMapper.entityToDomain(jpaMovieRepository.getOne(id));
	}

	@Override
	public void saveMovie(Movie movie) {
		jpaMovieRepository.save(MovieMapper.domainToEntity(movie));
		try {
			sendMessage.send(movie.getUserId());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
