package modelo;

public class Asma extends Enfermedad{
	private String tipo;

	public Asma(String enfermedad, float nivelDeRiesgo, String tipo) {
		super(enfermedad, nivelDeRiesgo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Asma [tipo=" + tipo + "]";
	}

	public float calcularRiesgo() {}
	
}
