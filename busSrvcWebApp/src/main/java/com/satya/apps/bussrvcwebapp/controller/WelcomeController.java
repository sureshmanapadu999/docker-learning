package com.satya.apps.bussrvcwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class WelcomeController {
	@GetMapping
	String getView(Model model) {
		return "index";
	}
}
