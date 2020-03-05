package com.ceiba.movies.domain.exceptions;

public class NotFoundMovieException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFoundMovieException(String message) {
        super(message);
    }
	
}
