package com.ceiba.movies.infrastructure.adapter.dbpostgresql.mapper;

import com.ceiba.movies.domain.model.Movie;
import com.ceiba.movies.infrastructure.adapter.dbpostgresql.jpaentiry.JpaMovie;

public final class MovieMapper {
	
	private MovieMapper() {}

	public static Movie entityToDomain(JpaMovie entity) {
        return new Movie(entity.getId(),entity.getTitle(),entity.getSynopsis(),entity.getUserId());
    }

    public static JpaMovie domainToEntity(Movie domain) {
    	return new JpaMovie(domain.getId(),domain.getTitle(),domain.getSynopsis(),domain.getUserId());
    }
}
