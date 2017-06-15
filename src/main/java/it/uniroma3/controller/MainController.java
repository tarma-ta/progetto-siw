package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.service.QuadroService;


	@Controller
	public class MainController{
		
		@Autowired
		QuadroService service;
		
		@RequestMapping(value = "/index")
		public String index(){
			return "index";
		}
		
		@RequestMapping(value = "/login")
		public String login(){
			return "login";
=======
import org.springframework.web.bind.annotation.GetMapping;

import it.uniroma3.service.QuadroService;


	@Controller
	public class MainController{
		
		@Autowired
		QuadroService service;
		
		@GetMapping(value = "/index")
		public String index(){
			return "index";
>>>>>>> branch 'master' of https://github.com/tarma-ta/progetto-siw.git
		}
}