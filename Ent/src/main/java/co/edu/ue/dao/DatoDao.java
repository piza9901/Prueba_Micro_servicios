package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import co.edu.ue.model.Dato;

public class DatoDao implements DatoDaoI {

	@Autowired
	DatoJPA datoJPA;
	
	@Override
	public Dato addDato(Dato dato) {
		return datoJPA.save(dato);
	}

	@Override
	public Dato updateDato(Dato dato) {
		
		return datoJPA.save(dato);
	}

	@Override
	public void delecIdDato(Dato dato) {
		datoJPA.delete(dato);
		
	}

	@Override
	public Dato searchDato(int id) {
		// TODO Auto-generated method stub
		return datoJPA.findById(id).orElse(null);
	}

	@Override
	public List<Dato> getAllDato() {
		// TODO Auto-generated method stub
		return datoJPA.findAll();
	}

	@Override
	public Dato searchDato(String dato) {
		// TODO Auto-generated method stub
		return datoJPA.findByCorreo(dato);
	}
	

}
