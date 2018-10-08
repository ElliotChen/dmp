package tw.elliot.dmp.isp.better;

public class Dove implements Huntable, Flyable {

	@Override
	public void hunt() {
		System.out.println("我吃虫子");
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
