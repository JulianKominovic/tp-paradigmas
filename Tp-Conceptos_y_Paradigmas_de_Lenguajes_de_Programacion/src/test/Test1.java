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

	//SI EL NIVEL DE RIESGO DE LOS PADRES SUMAN 200Y EL TEST ES:"true" QUIERE DECIR QUE SON POSITIVOS EN DIABETES 2 Y LA PROBABILIDAD DEL HIJO ES DEL 70
	//SI UNO DE LOS 2 PADRES TIENE UN NIVEL DE RIESGO DE 100 QUIERE DECIR QUE ES POSITIVO EN DIABETES 2 Y LA PROBABILIDAD ES DEL 40%
	//DE LO CONTRAIO LA PROBABILIDAD ES DEL 0 %
	
		
System.out.println(diabetesPadre.toString()+diabetesPadre.calcularRiesgo(100f, 100f, true));		//ACA AL SER LOS 2 POSITIVOS DEBE DAR PROBABILIDAD DEL 70%
System.out.println(diabetesPadre.toString()+diabetesPadre.calcularRiesgo(60f, 100f, true));		//ACA SOLO UNO ES POSITIVO ENTONCES LA PROBABILIDAD DEBE DAR 40%
System.out.println(diabetesPadre.toString()+diabetesPadre.calcularRiesgo(60f, 10f, false));		//ACA NINGUNO ES POSITIVO ASIQUE LA PROBABILIDAD ES DEL 0%
System.out.println(diabetesPadre.toString()+diabetesPadre.calcularRiesgo(100f, 100f, false));	//PRUEBA DE LABORATORIO ACA LOS 2 SUMAN 200 PERO EL TEST ES FALSE DEBE DAR 0%
System.out.println("========================================================================");
	}

}
