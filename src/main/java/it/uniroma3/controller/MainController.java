package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import it.uniroma3.service.QuadroService;


	@Controller
	public class MainController{
		
		@Autowired
		QuadroService service;
		
		@GetMapping(value = "/index")
		public String index(){
			return "index";
		}
}