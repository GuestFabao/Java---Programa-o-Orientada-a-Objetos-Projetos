package entities;

public class Rectangle {
	
	public double Widht, Height;
	
	public double Area(){
		return Widht * Height;
	}
	
	public double Perimeter() {
		return (Widht + Height) * 2;
	}
    
	public double Diagonal() {
		return Math.sqrt (Widht * Widht + Height * Height );
	}
	
	
	
}
