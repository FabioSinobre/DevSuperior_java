package objectOriented02.entiti;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Produto " + name + " - " + " R$ " + String.format("%.2f", price) + " - " 
				+ " Quantidade em estoque: " + quantity + " - " 
				+ "Valor total do produto em estoque: R$" + String.format("%.2f", totalValueInStock());
	}

}
