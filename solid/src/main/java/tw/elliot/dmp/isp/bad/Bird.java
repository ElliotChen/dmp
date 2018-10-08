package tw.elliot.dmp.isp.bad;

public class Bird {
	public void eat(Behavior behavior) {
		behavior.hunt();
	}

	public void slide(Behavior behavior) {
		behavior.glide();
	}

	public void fly(Behavior behavior) {
		behavior.fly();
	}
}
