package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private final DemoRepository demoRepository;


	public DemoController(DemoRepository demoRepository) {
		this.demoRepository = demoRepository;
	}
}
