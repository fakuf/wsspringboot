package com.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ws.idao.IPersonaDao;
import com.ws.iservice.IPersonaService;
import com.ws.modelo.Persona;
@Service("personaservice")
public class PersonaService implements IPersonaService {
	@Autowired
	@Qualifier("personadao")
	private IPersonaDao personadao;
	
	public List<Persona> recuperar(){
		try {
			return personadao.findAll();
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Persona guardar(Persona p) {
		try {
			return personadao.save(p);
		}catch(Exception e) {
			throw e;
		}
	}

	public IPersonaDao getPersonadao() {
		return personadao;
	}

	public void setPersonadao(IPersonaDao personadao) {
		this.personadao = personadao;
	}
	
	

}
