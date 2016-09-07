import java.util.Scanner;


public class FigureMain {
	
	public static void main(String[] args) {
		
		int val;
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("Enter Your Choice (1/2/3) :");
		val = scan.nextInt();
		
		switch (val) {
		case 1:
			System.out.println("Enter the Radius of the Circle :");
			c.dim1 = scan.nextDouble();
			c.findArea();
			c.findPerimeter();
			break;
			
		case 2:
			System.out.println("Enter the Length of the Rectangle :");
			r.dim1 = scan.nextDouble();
			System.out.println("Enter the Breadth of the Rectangle :");
			r.dim2 = scan.nextDouble();
			r.findArea();
			r.findPerimeter();
			break;
			
		case 3:
			System.out.println("Enter the side of the Square :");
			s.dim1 = scan.nextDouble();
			s.findArea();
			s.findPerimeter();
			break;

		default:
			System.out.println("Oops!!! Invalid Entry. Type 1 or 2 or 3. Try Again");
			break;
		}
	}
	
}
