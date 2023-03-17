package folhaDePagamentos;

public class Metodos {
	public static float calculaSalarioBruto(float vh, int h) {
		return vh * h;
	}
	
	public static float calculaIR(float salBruto) {
		if (salBruto <= 1372.81) {
			return 0;
		} else {
			if (salBruto <= 2743.25) {
				return (float) ((salBruto * .15) - 205.92);
			} else {
				return (float) ((salBruto * .275) - 548.82);
			}
		}
	}
	
	public static float calculaINSS(float salBruto) {
		if (salBruto <= 868.29) {
			return (float) (salBruto * 0.08);
		} else {
			if (salBruto < 1447.14) {
				return (float) (salBruto * 0.09);
			} else {
				if (salBruto < 2894.28) {
					return (float) (salBruto * 0.11);
				} else {
					return (float) 318.37;
				}
			}
		}
	}
	
	public static float calculaFGTS(float salBruto) {
		return (float) (salBruto * 0.8);
	}
	
	public static float calculaSalarioLiquido(float salBruto, float ir, float inss) {
		return salBruto - ir - inss;
	}
}
