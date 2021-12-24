package controller;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping
	public String sayHi()
	{
		return "Welcomr CSI Pune";
	}

}
