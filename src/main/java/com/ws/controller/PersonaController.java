package com.ws.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.iservice.IPersonaService;
import com.ws.modelo.Persona;

@RestController
@RequestMapping("/v1")
public class PersonaController {
	
	@Autowired
	@Qualifier("personaservice")
	private IPersonaService personaservice;
	
	@PutMapping("/persona")
	public Persona guardar(@RequestBody @Valid Persona persona) {
		try {
			return personaservice.guardar(persona);
		}catch(Exception e) {
			return null;
		}
	}
	
	@GetMapping("/personas")
	public List<Persona> recuperar() {
		try {
			return personaservice.recuperar();
		}catch(Exception e) {
			return null;
		}
	}
	

	public IPersonaService getPersonaservice() {
		return personaservice;
	}

	public void setPersonaservice(IPersonaService personaservice) {
		this.personaservice = personaservice;
	}

}
