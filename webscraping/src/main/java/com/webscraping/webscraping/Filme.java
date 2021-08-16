package com.webscraping.webscraping;

public class Filme {
	private String posterColumn;
	private String titleColumn;
	private String ratingColumn_imdbRating;

	
	public Filme( String titleColumn , String  ratingColumn_imdbRating) {
		
		this.titleColumn = titleColumn;
		this.ratingColumn_imdbRating = ratingColumn_imdbRating;
		
		
	}
	
	public Filme() {
		
	}
	
	
	public String getTitleColumn() {
		return titleColumn;
	}

	public void setTitleColumn(String titleColumn) {
		this.titleColumn = titleColumn;
	}

	public String getRatingColumn_imdbRating() {
		return ratingColumn_imdbRating;
	}

	public void setRatingColumn_imdbRating(String ratingColumn_imdbRating) {
		this.ratingColumn_imdbRating = ratingColumn_imdbRating;
	}

	
   
	
	
}
