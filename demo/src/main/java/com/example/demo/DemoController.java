package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class DemoController {
	//Metodos para peticiones -> GET POST PUT DELETE 
	@GetMapping(value="saludar", produces = MediaType.TEXT_PLAIN_VALUE)
	public String Saludo() {
	
		return "hola mundo";
	}	
	//variables url
	@GetMapping(value = "sumar/{Num1}/{Num2}")
	public double Sumar(@PathVariable("N1") double number1, @PathVariable ("N2") double number2) {
		return number1 + number2;
	}
	
	@RequestMapping( value ="restar", method=RequestMethod.GET)
	public double Restar(@RequestParam ("Num1") double Numb1, @RequestParam("Num2") double Numb2) {
		System.out.println(Numb1);
		System.out.println(Numb2);
		return Numb1 - Numb2;
	}
	
}

