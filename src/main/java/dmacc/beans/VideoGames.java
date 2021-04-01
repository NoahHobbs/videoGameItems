package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGames {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String gameName;
	private String yearOfRelease;
	private double price;
	private String rating;
	
	public VideoGames() {
		super();
	}
	
	public VideoGames(long id, String gameName, String yearOfRelease, double price, String rating) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
		this.rating = rating;
	}
	public VideoGames(String gameName, String yearOfRelease, double price, String rating) {
		super();
		this.gameName = gameName;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
		this.rating = rating;
	}
	
	public VideoGames(String gameName, double price) {
		super();
		this.gameName = gameName;
		this.price = price;
	}
	
	public VideoGames(String gamename) {
		super();
		this.gameName = gamename;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "VideoGames [id=" + id + ", gameName=" + gameName + ", yearOfRelease=" + yearOfRelease + ", price="
				+ price + ", rating=" + rating + "]";
	}
	
	

	
	
}
