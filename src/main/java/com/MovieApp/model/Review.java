package com.MovieApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Review {
	
	@Id
	private int ReviewId;
	private String ReviewBody;
	
	
	public Review(int reviewId, String reviewBody) {
		super();
		ReviewId = reviewId;
		ReviewBody = reviewBody;
	}


	public int getReviewId() {
		return ReviewId;
	}
	public void setReviewId(int reviewId) {
		ReviewId = reviewId;
	}


	public String getReviewBody() {
		return ReviewBody;
	}
	public void setReviewBody(String reviewBody) {
		ReviewBody = reviewBody;
	}


	@Override
	public String toString() {
		return "Review [ReviewId=" + ReviewId + ", ReviewBody=" + ReviewBody + "]";
	}
	
	
	
	
}
