package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Dato;

public interface DatoServiceI {
	Boolean addDato(Dato dato);
	List<Dato> getAllDato();
	void updateDato(Dato dato);
	boolean deletedatoID(int idDato);
		 
}
