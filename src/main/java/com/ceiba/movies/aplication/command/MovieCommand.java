package com.ceiba.movies.aplication.command;

public class MovieCommand {

	private Long id;
	private String title;
	private String synopsis;

	public MovieCommand(Long id, String title, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
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

}
