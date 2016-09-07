
public class Circle extends Figure {

	void findArea() {
		
		double area = (3.14)*dim1*dim1;
		System.out.println("Area of the circle with Radius " + dim1 + " is " + area);
	}

	void findPerimeter() {
		
		double perimeter = (2*3.14)*dim1;
		System.out.println("Perimeter of the circle with Radius " + dim1 + " is " + perimeter);
		
	}

	
}
