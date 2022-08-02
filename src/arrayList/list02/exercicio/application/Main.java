package arrayList.list02.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import arrayList.list02.exercicio.entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();

		System.out.println("Quantos funcionários serão registrados?");
		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println();
			System.out.println("funcionário #" + i + 1 + ": ");

			System.out.print("id: ");
			Integer id = scan.nextInt();
			while (hasId(employee, id)) { // verificação de id
				System.out.println("Id existente tente outro id: ");
				id = scan.nextInt();
			}

			System.out.print("Nome: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Salario: ");
			Double salary = scan.nextDouble();

			employee.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Digite o id do funciónario: ");
		int id = scan.nextInt();
		Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//Integer pos = position(list, idsalary);
		if (emp == null) {
			System.out.println("Esse id não existe!");
		} else {
			System.out.print("Enter a porcentagem: ");
			double percentage = scan.nextDouble();
			emp.salaryIncrease(percentage);
		}

		System.out.println();
		System.out.println("Lista de funciónario:");
		for (Employee obj : employee) {
			System.out.println(obj);
		}

		scan.close();
	}

	public static boolean hasId(List<Employee> list, int id) {// procura id função auxiliar
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	/*
	 * public static Integer pos(List<Employee> list, int id) { for(int i=0;
	 * i<list.size(); i++){ if(list.get(i).getId() == id) return i; } return null; }
	 */

}
