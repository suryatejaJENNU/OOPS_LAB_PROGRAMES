class Lamp {
	boolean isOn;
	 String lampType;
	Lamp(boolean isOn,String lampType ) {
		this.isOn = isOn;
		this.lampType = lampType;
		
	}
	void turnOn() {
		isOn = true;
	}
	void turnOff() {
		isOn = false;
	}
	boolean status() {
		if(isOn == true) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Lam {
	public static void main(String args[]) {
	Lamp l1 = new Lamp(true,"led");
	Lamp l2 = new Lamp(false,"halogen");
	l1.turnOff();
	l2.turnOn();
	if(l1.status()) {
		System.out.println("led buld is on");
	}
	else{
		System.out.println("led buld is off");
	}
	if(l2.status()) {
		System.out.println("halogen buld is on");
	}
	else{
		System.out.println("halogen buld is off");
	}
      }
	
}
	
