package co.edu.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**import org.springframework.http.MediaType;**/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yaml.snakeyaml.util.ArrayStack;

import co.edu.ue.model.Dato;
import co.edu.ue.service.DatoServiceI;

public class DatoController {
	@Autowired
	DatoServiceI service;
	
	@GetMapping(value="datos", produces= org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<Dato> geDatos(){
		return service.getAllDato();
	} 
	
	@PostMapping(value="datos", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Boolean saveDato(@RequestBody Dato dato) {
		return service.addDato(dato);
	}
	
	@Autowired
	RestTemplate template;

	String baseUrl = "http://loalhost:8080";
	
	@GetMapping(value = "Dato", produces = org.springframework.http.MediaType.APPLICATION_CBOR_VALUE)
	public List<Dato> ListDato(){
		try {
			Dato[] Dato = template.getForObject(baseUrl+"datos", Dato[].class);
			return Arrays.asList(Dato);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
			return null;
		}
	}
}
