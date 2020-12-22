package fr.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.ensim.tp5.model.AdresseRepository;

@Controller
public class FormAdressController {
	
	@GetMapping("/adresse")
	public String showFormAdress(Model model) {
		return "adresse";
	}

	
}

