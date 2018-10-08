package tw.elliot.dmp.isp.bad;

public class Dog {
	public void eat(Behavior behavior){
		behavior.hunt();
	}

	public void move(Behavior behavior) {
		behavior.walk();
	}

	public void flash(Behavior behavior) {
		behavior.run();
	}
}
