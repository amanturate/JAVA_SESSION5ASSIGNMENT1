
public class Square extends Figure {

	void findArea() {
		
		double area = dim1*dim1;
		System.out.println("Area of the square with side " + dim1 + " is " + area);
		
	}

	void findPerimeter() {

		double perimeter = 4*dim1;
		System.out.println("Perimeter of the square with side " + dim1 + " is " + perimeter);
		
	}

}
