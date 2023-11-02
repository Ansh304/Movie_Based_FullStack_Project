package com.MovieApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieApp.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Integer>{

}
//1