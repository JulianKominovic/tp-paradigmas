package test;

import modelo.Asma;
import modelo.Diabetes;
import modelo.Enfermedad;
import modelo.Miopia;
import modelo.Persona;

public class Test1 {

	public static void main(String[] args) {

		/*--- ENFERMEDADES PADRE ---*/
		Enfermedad asmaPadre = new Asma("Asma", 33.12f, "Intermitente");
		
		Enfermedad diabetesPadre = new Diabetes("Diabetes", 2.45f, '1');
		
		Enfermedad miopiaPadre = new Miopia("Diabetes", 98.16f, 80.45f, 70.25f);
		
		
		/*--- ENFERMEDADES MADRE ---*/
		Enfermedad asmaMadre = new Asma("Asma", 33.12f, "Intermitente");
		
		Enfermedad diabetesMadre = new Diabetes("Diabetes", 2.45f, '1');
		
		Enfermedad miopiaMadre = new Miopia("Diabetes", 98.16f, 80.45f, 70.25f);
		
		
		/*--- PADRE ---*/
		Persona padre = new Persona("Raul", "Gomez", 55);
		
		padre.getEnfermedades().add(asmaPadre);
		padre.getEnfermedades().add(diabetesPadre);
		padre.getEnfermedades().add(miopiaPadre);

		
		/*--- MADRE ---*/
		Persona madre = new Persona("Alejandra", "Martinez", 52);
		
		madre.getEnfermedades().add(asmaMadre);
		madre.getEnfermedades().add(diabetesMadre);
		madre.getEnfermedades().add(miopiaMadre);
	
		
		/*--- HIJA ---*/
		Persona hija = new Persona("Sofia", "Gomez", 18);
		
	}

}
