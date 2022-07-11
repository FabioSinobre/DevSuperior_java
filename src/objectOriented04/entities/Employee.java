package objectOriented04.entities;

public class Employee {
	public String name;
	public double salary;
	public double tax;
	//public double porcetage = 0.1;
	
	
	public double netSalary() {
		return salary - tax;
	}
	
	public void increaseSalary(double percetage) {
		salary += salary * percetage;
	}
	
	public String toString() {
		return "Salário atualizado do funcionário: " + name + ", R$ " + salary;
	}
}
