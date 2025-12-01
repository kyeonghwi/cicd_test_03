package org.example.cicd_test_03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String main() {
		return "cicd-test-03 auti deploy docker container";
	}
}
