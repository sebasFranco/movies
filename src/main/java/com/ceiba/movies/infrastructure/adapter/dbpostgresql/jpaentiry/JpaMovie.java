package com.ceiba.movies.infrastructure.adapter.dbpostgresql.jpaentiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "movies")
public class JpaMovie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String title;
	@NotNull
	private String synopsis;
	@NotNull
	@Column(name = "user_id")
	private Long userId;

	
	
	public JpaMovie() {
	}

	public JpaMovie(Long id, @NotNull String title, @NotNull String synopsis, @NotNull Long userId) {
		super();
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public Long getUserId() {
		return userId;
	}

}
