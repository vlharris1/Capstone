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
		
		@GetMapping("/dingbat")
	    public String dingbat() {
	        return "dingbat";
	    }
		
		@GetMapping("/ranch")
	    public String ranch() {
	        return "ranch";
	    }
		
		@GetMapping("/mcmansion")
	    public String mcmansion() {
	        return "mcmansion";
	    }
		
		@GetMapping("/colonial")
	    public String colonial() {
	        return "colonial";
	    }
		
		@GetMapping("/victorian")
	    public String victorian() {
	        return "victorian";
	    }
					
		@PostMapping("/questions")
		public String questionsSubmit(@ModelAttribute YourDreamHouse yourDreamHouse, Model model) {
			model.addAttribute("YourDreamHouse", yourDreamHouse);
			return "questions";	
		}			
}	
