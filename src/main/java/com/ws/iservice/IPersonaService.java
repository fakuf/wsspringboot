package com.ws.iservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ws.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona> recuperar();
	
	public Persona guardar(Persona p);

}
