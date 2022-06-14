package modelo;

import java.util.ArrayList;
import java.util.List;

public class Miopia extends Enfermedad {
	private float gradoDerecho;
	private float gradoIzquierdo;

	public Miopia(String enfermedad, float nivelDeRiesgo, float gradoDerecho, float gradoIzquierdo) {
		super(enfermedad, nivelDeRiesgo);
		this.gradoDerecho = gradoDerecho;
		this.gradoIzquierdo = gradoIzquierdo;
	}

	public float getGradoDerecho() {
		return gradoDerecho;
	}

	public void setGradoDerecho(float gradoDerecho) {
		this.gradoDerecho = gradoDerecho;
	}

	public float getGradoIzquierdo() {
		return gradoIzquierdo;
	}

	public void setGradoIzquierdo(float gradoIzquierdo) {
		this.gradoIzquierdo = gradoIzquierdo;
	}

	private float probilidadSegunOjo(float factorEdad, float gradoPadre, float gradoMadre) {
		return ((gradoPadre + gradoMadre) / 2 + (factorEdad * super.nivelDeRiesgo)) / 10;
	}

	private String construirResultado(float probOjoDerecho, float probOjoIzquierdo, int edad) {
		return "EDAD (" + edad + ")\n |---- OJO DERECHO: " + probOjoDerecho + "\n |---- OJO IZQUIERDO: "
				+ probOjoIzquierdo + "\n";
	}

	public List<String> calcularRiesgo(float gradoDerechoPadre, float gradoIzquierdoPadre, float gradoDerechoMadre,
			float gradoIzquierdoMadre) {
		List<String> probabilidades = new ArrayList<>();

		for (int i = 1; i < 80; i++) {
			float factorEdad = 0.43f * i;
			float probOjoDerecho = this.probilidadSegunOjo(factorEdad, gradoDerechoPadre, gradoDerechoMadre);
			float probOjoIzquierdo = this.probilidadSegunOjo(factorEdad, gradoIzquierdoPadre, gradoIzquierdoMadre);
			String resultado = this.construirResultado(probOjoDerecho, probOjoIzquierdo, i);
			probabilidades.add(resultado);

		}

		return probabilidades;
	}

	@Override
	public float calcularRiesgo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
