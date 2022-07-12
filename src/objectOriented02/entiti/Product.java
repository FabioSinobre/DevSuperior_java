package objectOriented02.entiti;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {//com a sobregarga a quantidade começa com Zero automaticamente
		this.name = name;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
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
				+ "Valor total do produto em estoque: R$ " + String.format("%.2f", totalValueInStock());
	}

}
