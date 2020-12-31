package com.tts.yourdreamhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.yourdreamhouse.model.User;
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
		
		@RequestMapping(value="/registrationform", method = RequestMethod.GET)
		public String answer(Model model) {
			User user = new User();
			YourDreamHouse dream = new YourDreamHouse();
			model.addAttribute("user", user);
			model.addAttribute("dream", dream);
			return "registrationform";
		}
		
		@PostMapping("/registrationform")
		public String answerSubmit(@ModelAttribute("user") User user) {
		    System.out.println("user: " + user);
		    return "registrationform";
		  }
	
}	
