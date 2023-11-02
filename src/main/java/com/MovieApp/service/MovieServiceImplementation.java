package com.MovieApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieApp.model.Movie;
import com.MovieApp.repository.MovieRepository;

@Service
public class MovieServiceImplementation implements MovieServices {
	
	@Autowired
	private MovieRepository movieRepo;
	@Override
	public Movie createEmployee(Movie Movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getEmployee() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
