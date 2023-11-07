class TV {
	int Channel;
	int volume_level;
	boolean on;
	TV(int Channel,int volume_level,boolean on){
		this.Channel = Channel;
		this.volume_level = volume_level;
		this.on = on;
	}
	
	boolean status () {
		if(on) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void turnOn () {
		if(on) {
			System.out.println("already tv is on");
		}
		else {
			on = true;
		}
		
	}
	void turnOff () {
		if(on) {
			on = false;
		}
		else {
			System.out.println("already tv is off");
		}
	}
	void setChannel(int newChannel) {
		Channel = newChannel;
	}
	void setVolume(int newVolume) {
		volume_level = newVolume;
	}
	void channelUp() {
		if(Channel == 40) {
			System.out.println("cannot increace more than 40 channels");
		}
		else {
			Channel++;
		}
	}
	void channelDown() {
		if(Channel == 1) {
			System.out.println("cannot decrese less than 1 channels");
		}
		else {
			Channel--;
		}
	}
	void volumeUp() {
		if(volume_level == 7) {
			System.out.println("cannot increace more than 7 volume");
		}
		else {
			volume_level++;
		}
	}
	void volumeDown() {
		if(volume_level == 1) {
			System.out.println("cannot decrese less than 1 volume");
		}
		else {
			volume_level--;
		}
	}
}

class Tvs {
	public static void main(String args[]) {
		TV t1 = new TV(4,2,true);
		System.out.println("initial status of Tv is " + t1.status()+" channel : " + t1.Channel+  " volume: " + t1.volume_level);
		if(t1.status()) {
			t1.setChannel(16);
			t1.channelUp();
			t1.setVolume(6);
			t1.volumeUp();
			t1.volumeUp();
			t1.volumeDown();
			System.out.println("final status of Tv is " + t1.status()+" channel : " + t1.Channel+ " volume: " + t1.volume_level);
			
		}
		else {
			System.out.println("tv is not on Turn on first turn on");
		}
		
	}
}
