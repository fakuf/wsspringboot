package com.ws.idao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.modelo.Persona;

@Repository("genericdao")
public interface IGenericDao extends JpaRepository<Persona, Serializable> {
	
	/**
	 * 
	 * @param dni
	 * @return
	 */
	public abstract Persona findByDni(Long dni);
	
	/**
	 * 
	 * @return
	 */
	public abstract List<Persona> findAll();

}
