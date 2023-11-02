package com.MovieApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MovieApp.model.Movie;
import com.MovieApp.service.MovieServices;

@RestController
public class movieController {
	
	@Autowired
	private MovieServices movieService;
	
	@GetMapping("/")
	public List<Movie> showAllMovies() {
		return movieService.getEmployee() ;
	}
	
	@PostMapping("/SignUp")
	public Movie CreateMovie() {
		return null;
		
	}
	
}
