package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class VideoGames {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String gameName;
	private String yearOfRelease;
	private double price;
	private String rating;
	
	public VideoGames(String gameName) {
		super();
		this.gameName = gameName;
	}
	
	public VideoGames(String gameName, String yearOfRelease, double price, String rating) {
		super();
		this.gameName = gameName;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
		this.rating = rating;
	}
	
	public VideoGames(String gameName,double price, String rating) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.rating = rating;
	}
	public VideoGames(String gameName, double price) {
		super();
		this.gameName = gameName;
		this.price = price;
	}
}
