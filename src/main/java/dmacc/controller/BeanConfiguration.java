package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.VideoGames;

@Configuration
public class BeanConfiguration {
	@Bean
	public VideoGames VideoGames() {
		VideoGames bean = new VideoGames("Eric Carle");
		bean.setGameName("Fortnite");
		bean.setYearOfRelease("2016");
		bean.setPrice(19.99);
		bean.setRating("T");
		return bean;
		
	}
}
