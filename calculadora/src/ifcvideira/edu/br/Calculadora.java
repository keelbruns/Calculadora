package ifcvideira.edu.br;

public class Calculadora {
	private int a;
	private int b;
	public int resultado;
	
	public int somar() {
		return resultado = a + b;
	}
	public int subtrair() {
		return resultado = a - b;
	}
	public int dividir() {
		return resultado = a / b;
	}
	public int multiplicacao() {
		return resultado = a * b;
	}
	
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
