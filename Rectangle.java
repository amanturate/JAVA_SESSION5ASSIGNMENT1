
public class Rectangle extends Figure  {
	double dim2;
	void findArea() {
		
		double area = dim1*dim2;
		System.out.println("Area of the rectangle with sides " + dim1 + " and " + dim2 + " is " + area);
		
	}

	void findPerimeter() {
		
		double perimeter = 2*(dim1 + dim2);
		System.out.println("Perimeter of the rectangle with sides " + dim1 + " and " + dim2 + " is " + perimeter);
		
	}

}
