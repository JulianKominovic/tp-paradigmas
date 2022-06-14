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

		/*--- PADRE ---*/
		Persona padre = new Persona("Raul", "Gomez", 55);

		padre.getEnfermedades().add(asmaPadre);
		padre.getEnfermedades().add(diabetesPadre);
		padre.getEnfermedades().add(miopiaPadre);

	}

}
