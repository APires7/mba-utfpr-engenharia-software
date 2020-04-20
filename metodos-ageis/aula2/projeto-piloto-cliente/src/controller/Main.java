/**
 * 
 */
package controller;

import java.util.Scanner;

import model.Funcionario;

/**
 * @author allan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Olá, digite as informações abaixo");
		System.out.print("Código do funcionário: ");
		funcionario.setCodigo(scanner.nextInt());

		System.out.print("Nome do funcionário: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Endereço: ");
		funcionario.setEndereco(scanner.nextLine());

		System.out.print("Cidade: ");
		funcionario.setCidade(scanner.nextLine());

		System.out.print("CEP: ");
		funcionario.setCep(scanner.nextLine());

		System.out.print("E-mail: ");
		funcionario.setEmail(scanner.nextLine());

		System.out.print("Salario: ");
		funcionario.setSalario(scanner.nextDouble());

		System.out.print("Quantidade de Horas Extras: ");
		Integer qtdHorasExtras = scanner.nextInt();

		System.out.println("Salário líquido: " + calculaSalarioLiquido(funcionario.getSalario(), qtdHorasExtras));
		scanner.close();
	}

	public static Double calculaSalarioLiquido(Double pSalario, Integer pQtdHorasExtras) {
		Double salarioLiquido = null;

		Double valorHora = pSalario / 220;
		Double valorHoraExtra = valorHora * pQtdHorasExtras;

		salarioLiquido = (pSalario + valorHoraExtra) * 0.85;

		return salarioLiquido;
	}

}
