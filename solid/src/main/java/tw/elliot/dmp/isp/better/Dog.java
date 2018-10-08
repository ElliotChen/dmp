package tw.elliot.dmp.isp.better;


public class Dog {
	public void eat(Huntable behavior){
		behavior.hunt();
	}

	public void move(Runnable behavior) {
		behavior.walk();
	}

	public void flash(Runnable behavior) {
		behavior.run();
	}
}
