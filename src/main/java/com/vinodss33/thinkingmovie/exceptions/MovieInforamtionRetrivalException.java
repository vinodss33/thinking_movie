package com.accolite.thinkingmovie.exceptions;

public class MovieInforamtionRetrivalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1823164417936823435L;

	public MovieInforamtionRetrivalException() {
		super();
	}

	public MovieInforamtionRetrivalException(String error) {
		super(error);
	}

	public MovieInforamtionRetrivalException(String error, Exception e) {
		super(error, e);
	}
}
