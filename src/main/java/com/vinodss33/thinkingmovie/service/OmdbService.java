package com.accolite.thinkingmovie.service;

import com.accolite.thinkingmovie.exceptions.MovieInforamtionRetrivalException;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbParameters;

public interface OmdbService {
	OmdbVideoFull getMovieInfo(OmdbParameters omdbParameters) throws MovieInforamtionRetrivalException;
}
