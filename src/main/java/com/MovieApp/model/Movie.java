package com.MovieApp.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Movie {
	
	@Id
	private int imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private List<String>genres;
	private String poster;
	private List<String>backdrops;
	@ManyToOne
	private Review reviews;
	
	public Review getReviews() {
		return reviews;
	}


	public void setReviews(Review reviews) {
		this.reviews = reviews;
	}


	public Movie(int imdbId, String title, String releaseDate, String trailerLink, List<String> genres,
			String poster, List<String> backdrops) {
		super();
		this.imdbId = imdbId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.trailerLink = trailerLink;
		this.genres = genres;
		this.poster = poster;
		this.backdrops = backdrops;
	}


	public int getImdbId() {
		return imdbId;
	}
	public void setImdbId(int imdbId) {
		this.imdbId = imdbId;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	public String getTrailerLink() {
		return trailerLink;
	}
	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}
	
	
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	
	
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	
	public List<String> getBackdrops() {
		return backdrops;
	}
	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}
	
	
	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releaseDate=" + releaseDate + ", trailerLink="
				+ trailerLink + ", genres=" + genres + ", poster=" + poster + ", backdrops=" + backdrops + ", reviews="
				+ reviews + "]";
	}

	
	
	
	
	
	
}
