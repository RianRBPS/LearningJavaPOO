import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		double cateto1;
		double cateto2;
		double hipotenusa;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		cateto1 = scanner.nextDouble();
		System.out.println("Enter side y: ");
		cateto2 = scanner.nextDouble();
		
		hipotenusa = Math.sqrt((cateto1 * cateto1)+(cateto2 * cateto2));
		
		System.out.println("The hypotenuse is :"+hipotenusa);
		
		scanner.close(); // Good practice
	}
}
