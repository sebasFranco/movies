package com.ceiba.movies.infrastructure.adapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ceiba.movies.domain.ports.MovieRepository;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.db.PostgresqlMovieRepository;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.jparepository.JpaMovieRepository;

@Configuration
public class CaseUseConfiguration {

	@Primary
	@Bean
    public MovieRepository userRepository(JpaMovieRepository jpaMovieRepository) {
        return new PostgresqlMovieRepository(jpaMovieRepository);
    } 
}
