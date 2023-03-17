package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Salarie;
import com.inti.repository.ISalarieRepository;

@Controller
@RequestMapping("salarie")
public class SalarieController {

	@Autowired
	ISalarieRepository isr;
	
	@GetMapping("hello")
	public String hello()
	{
		return "hello";
	}
	
	// Enregistrer un nouveau salarié
	@GetMapping("formSalarie")
	public String formSalarie() {
		return "formSalarie";
	}

	@PostMapping("saveSalarie")
	public String saveSalarie(@ModelAttribute("salarie") Salarie l) {
		isr.save(l);
		return "redirect:/listeSalarie";
	}

	// Afficher la liste des salariés
	@GetMapping("listeSalarie")
	public String listeSalarie(Model m) {
		m.addAttribute("listeSalarie", isr.findAll());
		return "listeSalarie";
	}
	@GetMapping("getSalarie")
	public String getSalarie(@RequestParam("id") int id, Model m) {
		m.addAttribute("salarie", isr.findById(id).get());
		return "getSalarie";
	}
	
	// Supprimer un salarié
	@GetMapping("deleteSalarie")
	public String deleteSalarie(@RequestParam("id") int id) {
		isr.deleteById(id);
		return "redirect:/listeSalarie";
	}
	
	// Modifier un salarié
	@GetMapping("modifierSalarie")
	public String modifierSalarie(@RequestParam("id") int id, Model m)
	{
		m.addAttribute("salarie", isr.findById(id).get());
		return "modifierSalarie";
	}
	
	@PostMapping("updateSalarie")
	public String updateSalarie(@ModelAttribute("salarie") Salarie l)
	{
		isr.save(l);
		return "redirect:/listeSalarie";
	}
	

}
