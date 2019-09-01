package com.accolite.thinkingmovie.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.thinkingmovie.exceptions.MovieInforamtionRetrivalException;
import com.accolite.thinkingmovie.model.ErrorResponse;
import com.accolite.thinkingmovie.service.OmdbService;
import com.accolite.thinkingmovie.utilities.Constants;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbParameters;
import com.omertron.omdbapi.tools.Param;

@RestController
@RequestMapping("/thinkingmovie/movie")
public class MovieController {
	private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);
	@Autowired
	private OmdbService omdbService;

	@RequestMapping(value = "/{movieName}", method = RequestMethod.GET)
	@Cacheable("movie")
	public ResponseEntity<?> getMovieInfo(@PathVariable("movieName") String movieName,
			@RequestParam Map<String, String> findingParams) {
		OmdbParameters omdbParameters = new OmdbParameters();
		ErrorResponse errorResponse;
		if (StringUtils.isNotEmpty(movieName)) {
			omdbParameters.add(Param.fromString("t="), movieName);
		} else {
			errorResponse = errorMessage(HttpStatus.BAD_REQUEST.value(), "Movie name is mandatory");
			errorResponse.setField("movieName");
		}

		Set<Map.Entry<String, String>> entries = findingParams.entrySet();
		for (Entry<String, String> entry : entries) {
			omdbParameters.add(Param.fromString(entry.getKey() + Constants.PARAM_SUFFIX), entry.getValue());
		}
		OmdbVideoFull movieInfo = null;
		try {
			movieInfo = omdbService.getMovieInfo(omdbParameters);
		} catch (MovieInforamtionRetrivalException e) {
			LOG.error("Error while retrieving movie informtion of movie " + movieName + " ", e);
			errorResponse = errorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getCause().getMessage());
			return (new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR));

		}
		System.out.println("Return time "+Instant.now().atZone(ZoneId.systemDefault()));
		return (new ResponseEntity<OmdbVideoFull>(movieInfo, HttpStatus.OK));
	}

	private ErrorResponse errorMessage(int statusCode, String msg) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(statusCode);
		errorResponse.setMessage(msg);
		return errorResponse;
	}

	public void searchMovies(@RequestParam Map<String, String> allRequestParams) {

	}
}
