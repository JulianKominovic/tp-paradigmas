package modelo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private List<Enfermedad> enfermedades;
	
	public Persona() {
		
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.enfermedades = new ArrayList<Enfermedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
	
	
}
