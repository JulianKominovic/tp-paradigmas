package test;

import modelo.Asma;
import modelo.Diabetes;
import modelo.Enfermedad;
import modelo.Miopia;
import modelo.Persona;

public class Test2 {

	public static void main(String[] args) {

		/*--- ENFERMEDADES MADRE ---*/
		Enfermedad asmaTia = new Asma("Asma", 2.19f, "Intermitente");
		
		Enfermedad diabetesTia= new Diabetes("Diabetes", 78.45f, '1');
		
		Enfermedad miopiaTia = new Miopia("Diabetes", 0.70f, 0.45f, 0.25f);
		
		
		/*--- MADRE ---*/
		Persona tia = new Persona("Alejandra", "Martinez", 52);
		
		tia.getEnfermedades().add(asmaTia);
		tia.getEnfermedades().add(diabetesTia);
		tia.getEnfermedades().add(miopiaTia);
	
	}

}
