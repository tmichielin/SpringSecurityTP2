package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Client;
import com.inti.repository.IClientRepository;

@Controller
@RequestMapping("client")
public class ClientController {
	@Autowired
	IClientRepository icr;
	
	@GetMapping("inscription")
	public String formClient()
	{
		return "formClient";
	}
	
	@PostMapping("saveClient")
	public String saveClient(@ModelAttribute("client") Client c)
	{
		icr.save(c);
		
		return "redirect:/listeClient";
	}
	
	@GetMapping("listeClient")
	public String listeClient(Model m)
	{
		m.addAttribute("listeClient", icr.findAll());
		
		return "listeClient";
	}
	
	@GetMapping("deleteClient/{id}")
	public String deleteClient(@PathVariable("id") int id)
	{
		icr.deleteById(id);
		
		return "redirect:/listeClient";
	}
	
	

}
