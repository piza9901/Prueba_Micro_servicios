package co.edu.ue.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import co.edu.ue.model.Dato;

public interface DatoJPA extends JpaRepositoryImplementation<Dato, Integer> {
	Dato findByCorreo(String correo);

}
