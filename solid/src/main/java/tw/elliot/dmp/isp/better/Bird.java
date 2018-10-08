package tw.elliot.dmp.isp.better;


public class Bird {
	public void eat(Huntable behavior) {
		behavior.hunt();
	}

	public void slide(Flyable behavior) {
		behavior.glide();
	}

	public void fly(Flyable behavior) {
		behavior.fly();
	}
}
