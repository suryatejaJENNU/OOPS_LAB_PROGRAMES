class Car{
	String company;
	double mileage;
	double Speed;
	String color;
	Car(String company,double mileage,double Speed,String color) {
		this.company = company;
		this.mileage = mileage;
		this.Speed = Speed;
		this.color = color;
	}
	void getMileage() {
		System.out.println("mileage = "+ mileage);
	}
	void getSpeed() {
		System.out.println("speed = "+Speed);
		
	}
	void getColor () {
		System.out.println("color = "+color);
	}
	void getCompany() {
		System.out.println("company = "+company);
	}
	void status() {
		System.out.println("company = "+company);
		System.out.println("mileage = "+mileage);
		System.out.println("speed = "+Speed);
		System.out.println("color = "+color);
	}
}

class Cars {
	public static void main(String args[]) {
		Car c1 = new Car("roles roy",66.9,120.2,"grey");
		c1.status();
	}
}
