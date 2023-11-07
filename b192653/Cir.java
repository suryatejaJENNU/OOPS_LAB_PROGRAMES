class Circle {
	float radius;
	Circle(float radius) {
		this.radius = radius;
	}
	
	float getArea() {
		return (float)(Math.PI*radius*radius);
	}
	float getPerimeter() {
		return (float)(2 * Math.PI * radius * radius);
	}
}

class Cir{
	public static void main(String args[]) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(15);
		System.out.println("circle 1 Area & Radius");
		System.out.println("Area = " + c1.getArea());
		System.out.println("Area = " + c1.getPerimeter());
		
		System.out.println("circle 2 Area & Radius");
		System.out.println("Area = " + c2.getArea());
		System.out.println("Area = " + c2.getPerimeter());
		
		System.out.println("circle 3 Area & Radius");
		System.out.println("Area = " + c3.getArea());
		System.out.println("Area = " + c3.getPerimeter());
		
		
	}

}

