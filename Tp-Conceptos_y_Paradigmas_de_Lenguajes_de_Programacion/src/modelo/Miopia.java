package modelo;

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

	public float calcularRiesgo() {
		return 0;
	}

}
