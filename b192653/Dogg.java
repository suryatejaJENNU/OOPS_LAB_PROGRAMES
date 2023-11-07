class Dog {
	String name;
	String breed;
	String color;
	double height;
	String type;
	Dog(String name,String breed,String color,double height,String type) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.height = height;
		this.type = type;
	}
	String getBreed() {
		return breed;
	}
	String getName() {
		return name;
	}
}

class Dogg {
	public static void main(String args[]){
		Dog d1 =  new Dog("nikhil","manda","white",89,"male");
		System.out.println(d1.getBreed());
		System.out.println(d1.getName());
	}
}
