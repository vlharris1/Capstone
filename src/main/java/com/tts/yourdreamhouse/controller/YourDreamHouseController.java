package com.tts.yourdreamhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.tts.yourdreamhouse.model.YourDreamHouse;

@Controller
public class YourDreamHouseController {
		
		@GetMapping("/")
		public String index() {
			return "homepage";
		}
		
		@GetMapping("/questions")
	    public String main() {
	        return "questions";
	    }
		
				
		@PostMapping("/questions")
		public String questionsSubmit(@ModelAttribute YourDreamHouse yourDreamHouse, Model model) {
			model.addAttribute("YourDreamHouse", yourDreamHouse);
			return "questions";
		}
}
