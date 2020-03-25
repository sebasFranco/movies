package com.ceiba.movies.domain.model;

public class Movie {

	private Long id;
	private String title;
	private String synopsis;
	private Long userId;

	public Movie(Long id, String title, String synopsis, Long userId) {
		super();
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
