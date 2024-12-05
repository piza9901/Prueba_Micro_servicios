package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the datos database table.
 * 
 */
@Entity
@Table(name="datos")
@NamedQuery(name="Dato.findAll", query="SELECT d FROM Dato d")
public class Dato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;

	private String apellidos;

	private String contraseña;

	private String correo;

	private String documento;

	private String nombre;

	public Dato(int userID, String apellidos, String contraseña, String correo, String documento, String nombre) {
		super();
		this.userID = userID;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		this.correo = correo;
		this.documento = documento;
		this.nombre = nombre;
	}
	
	public Dato() {
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
}