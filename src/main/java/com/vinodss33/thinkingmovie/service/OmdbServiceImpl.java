package com.accolite.thinkingmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.thinkingmovie.exceptions.MovieInforamtionRetrivalException;
import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbParameters;
import com.omertron.omdbapi.tools.Param;
@Service
public class OmdbServiceImpl implements OmdbService {
	@Autowired
	private OmdbApi omdb;

	@Override
	public OmdbVideoFull getMovieInfo(OmdbParameters omdbParameters) throws MovieInforamtionRetrivalException {
		OmdbVideoFull movieInfo;
		try {
			omdbParameters.add(Param.TOMATOES, true);
			movieInfo = omdb.getInfo(omdbParameters);
		} catch (OMDBException e) {
			throw new MovieInforamtionRetrivalException(
					"Exception while fteching movie information of movie " + omdbParameters.get(Param.TITLE), e);
		}
		return movieInfo;
	}
}
