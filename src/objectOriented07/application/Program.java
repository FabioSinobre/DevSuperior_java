package objectOriented07.application;

import java.util.Scanner;

import objectOriented07.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account account;
		
		System.out.println("Entre com os dados da conta");
		System.out.print("Digite o número da conta: ");
		int number = scan.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		scan.nextLine();
		String holder = scan.nextLine();
		
		System.out.print("O cliente fará deposito (y / n): ");
		char initialDeposit =  scan.next().charAt(0);
		if(initialDeposit == 'y' ){ 
			System.out.print("Digite o valor inicial: R$ ");
			double deposit = scan.nextDouble();
			account = new Account(number, holder, deposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: R$ ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue);
		System.out.println("Saldo atualizado:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: R$ ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Saldo atualizado: ");
		System.out.println(account);
		scan.close();
	}

}
