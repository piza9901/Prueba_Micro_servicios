package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.DatoDaoI;
import co.edu.ue.model.Dato;

public class DatoService implements DatoServiceI {
	
	@Autowired
	DatoDaoI dao;

	@Override
	public Boolean addDato(Dato dato) {
	if (dao.searchDato(dato.getCorreo())==null) {
		dao.addDato(dato);
		
	}
		return false;
	}

	@Override
	public List<Dato> getAllDato() {
		// TODO Auto-generated method stub
		return dao.getAllDato();
	}

	@Override
	public void updateDato(Dato dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletedatoID(int idDato) {
		// TODO Auto-generated method stub
		return false;
	}

}
