package com.MovieApp.service;

import java.util.List;

import com.MovieApp.model.Movie;
//1
public interface MovieServices{
	Movie createEmployee(Movie Movie);
	List<Movie> getEmployee();
	Movie getEmployee(int id);
	Movie updateEmployee(int id , String name );
	void deleteEmployee(int id);
}
