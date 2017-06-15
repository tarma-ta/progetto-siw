package it.uniroma3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrazioneController {
	
	@GetMapping("/request")
	public String request(){
		return "request";
	}
	
	@PostMapping("/request")
	public String requestc()

}
