package modelo;

public class Diabetes extends Enfermedad {
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
		return 0;
	}
	public String calcularRiesgo(float nivelRP, float nivelRM, boolean test) {

		String probabilidades = null;

		if (test == true) {
			if (nivelRP + nivelRM == 200.0f) {

				probabilidades = "Nivel de riesgo es de 70%";

			} else if (nivelRP == 100f || nivelRM == 100f) {
				probabilidades = "Nivel de riesgo es de 40%";
			}
		}

		else
			probabilidades = "Nivel de riesgo es de 0%";
		return probabilidades;

	}
}
