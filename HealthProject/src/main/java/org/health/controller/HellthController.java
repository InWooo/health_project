package org.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/hellth/*")
@AllArgsConstructor
public class HellthController {
	
	
	@GetMapping(("/main"))
	public void main(Model model) {
		log.info("=====main======");
	}
	
	@GetMapping(("/index"))
	public void index(Model model) {
		log.info("=====index======");
	}
}
