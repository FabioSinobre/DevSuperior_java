package objectOriented03.entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return width*2 + height*2;
	}
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	
	public String toString() {
		return "Área = " + String.format("%.2f \n", area()) 
				+ "Perímetro = " + String.format("%.2f \n", perimeter())
				+ "Diagonal = " + String.format("%.2f \n", diagonal());
	}
}
