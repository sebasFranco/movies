package com.ceiba.movies.infrastructure.adapter.dbpostgresql.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.movies.infrastructure.adapter.dbpostgresql.jpaentiry.JpaMovie;

public interface JpaMovieRepository extends JpaRepository<JpaMovie, Long>{

}
