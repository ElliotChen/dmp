package tw.elliot.dmp.isp.bad;

public class Dove implements Behavior {
	@Override
	public void hunt() {
		System.out.println("我吃虫子");
	}

	@Override
	public void walk() {
		System.out.println("!!!!!不会走");
	}

	@Override
	public void run() {
		System.out.println("!!!!!!不会跑");
	}

	@Override
	public void glide() {
		System.out.println("会滑翔，很棒！");
	}

	@Override
	public void fly() {
		System.out.println("会飞，很开心！");
	}
}
