package it.uniroma3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrazioneController {
	
	@GetMapping("/request")
	public String request(){
		return "request";
	}
	
	@PostMapping("/request")
	public String request()

}
