package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.Widht = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
	
		
		System.out.printf("Area = %.2f%n", rectangle.Area());
		System.out.printf("Perimeter = %.2f%n", rectangle.Perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.Diagonal());
		
		
		
		
		
		sc.close();
	}

}
