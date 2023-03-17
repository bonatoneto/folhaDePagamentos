package folhaDePagamentos;

public class Principal {
	public static void main(String[] args) {
		boolean verifica = false;
		String nomeFuncionario;
		int opcao, mes, ano, numHorasTrabalhadas = 0;
		float valorHora = 0, salarioBruto = 0, ir = 0, inss = 0, fgts = 0, salarioLiquido = 0;
		do {
			System.out.println("\n\nSistema para calcular a folha de pagamento de um funcionario\n\n");
		 	System.out.println("1 - Ler dados\n");
			System.out.println("2 - Calcular salario liquido\n");
			System.out.println("3 - Sair\n");
			opcao = Console.readInt("Informe a opcao desejada:\n");
			switch(opcao) {
				case 1: 
					nomeFuncionario = Console.readString("Informe o nome do funcionario: ");
					mes = Console.readInt("Informe o mes: ");
					ano = Console.readInt("Informe o ano: ");
					numHorasTrabalhadas = Console.readInt("Informe o numero de horas trabalhadas do funcionario: ");
					valorHora = Console.readFloat("Informe o valor da hora: ");
					verifica = true;
					break;
				case 2:
					if (verifica == true) {
						salarioBruto = Metodos.calculaSalarioBruto(valorHora, numHorasTrabalhadas);
						ir = Metodos.calculaIR(salarioBruto);
						inss = Metodos.calculaINSS(salarioBruto);
						fgts = Metodos.calculaFGTS(salarioBruto);
						salarioLiquido = Metodos.calculaSalarioLiquido(salarioBruto, ir, inss);
						System.out.println("Salario Bruto: " + salarioBruto + "R$");
						System.out.println("Imposto de renda: " + ir + "R$");
						System.out.println("INSS: " + inss + "R$");
						System.out.println("FGTS: " + fgts + "R$");
						System.out.println("Salario liquido: " + salarioLiquido + "R$");
					} else {
						System.out.println("E necessario infromar os dados do funcionario para calcular o salario liquido!");
					}
					break;
			}
		} while(opcao != 3);
	}
}