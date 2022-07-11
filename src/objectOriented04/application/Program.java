package objectOriented04.application;

import java.util.Scanner;

import objectOriented04.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Digite o nome do funcionario: ");
		employee.name = scan.nextLine();
		System.out.print("Digite o salário do funcinário: R$ ");
		employee.salary = scan.nextDouble();
		System.out.print("Digite o imposto a ser deduzido: R$ ");
		employee.tax = scan.nextDouble();
		System.out.print("digite a porcetagem ");
		employee.increaseSalary(scan.nextDouble());
		
		
		System.out.print(employee);
		
		
		scan.close();

	}

}
