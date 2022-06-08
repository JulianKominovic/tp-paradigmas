package modelo;

public abstract class Enfermedad {
	protected String enfermedad;
	protected float nivelDeRiesgo;
	

	public Enfermedad(String enfermedad, float nivelDeRiesgo) {
		super();
		this.enfermedad = enfermedad;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}


	public String getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	public float getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}


	public void setNivelDeRiesgo(float nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}


	public abstract float calcularRiesgo();
}
