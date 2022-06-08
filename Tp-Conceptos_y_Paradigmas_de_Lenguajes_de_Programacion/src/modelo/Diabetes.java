package modelo;

public class Diabetes extends Enfermedad{
	private char tipo;

	public Diabetes(String enfermedad, float nivelDeRiesgo, char tipo) {
		super(enfermedad, nivelDeRiesgo);
		this.tipo = tipo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Diabetes [tipo=" + tipo + "]";
	}

	public float calcularRiesgo() {
	}
}
