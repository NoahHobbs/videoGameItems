package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.VideoGames;
import dmacc.repository.GameRepository;

@Controller
public class WebController {
	
	@Autowired
	GameRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllGames(Model model) {
		
		model.addAttribute("games",repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputGame")
	public String addNewGame(Model model) {
		VideoGames v = new VideoGames();
		model.addAttribute("newGame", v);
		return "input";
	}
	@PostMapping("/inputGame")
	public String addNewGame(@ModelAttribute VideoGames v, Model model) {
		repo.save(v);
		return viewAllGames(model);
	}
}
