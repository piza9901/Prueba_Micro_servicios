package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Dato;

public interface DatoDaoI {

	Dato addDato (Dato dato);
	Dato updateDato (Dato dato);
	void delecIdDato(Dato dato);
	Dato searchDato(int id);
	List<Dato> getAllDato();
	Dato searchDato(String dato);
	
}
