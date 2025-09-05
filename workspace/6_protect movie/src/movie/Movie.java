package movie;

import java.util.Objects;

public class Movie {
	public Movie() {;}
	private String title;
	private String genre;
	private double rating;
	public Movie(String title, String genre, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genre, rating, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(genre, other.genre)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& Objects.equals(title, other.title);
	}
	
	

}
