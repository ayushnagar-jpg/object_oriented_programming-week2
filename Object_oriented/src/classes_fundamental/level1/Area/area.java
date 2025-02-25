package classes_fundamental.level1.Area;

public class area {
	
	double radius;
	
	area(double radius){
		this.radius = radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	double calculateCircumference() {
		return 2*Math.PI*radius;
	}
	
	void display() {
		System.out.println(radius);
		System.out.println("Area Of Circle:"+ calculateArea());
		System.out.println("Circumference of Circle"+ calculateCircumference());
		
		
	}
}
