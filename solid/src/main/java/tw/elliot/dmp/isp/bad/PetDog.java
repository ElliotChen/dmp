package tw.elliot.dmp.isp.bad;

public class PetDog implements Behavior {
	@Override
	public void hunt() {
		System.out.println("我吃狗粮");
	}

	@Override
	public void walk() {
		System.out.println("主人牵我散步");
	}

	@Override
	public void run() {
		System.out.println("我跑特别快");
	}

	@Override
	public void glide() {
		System.out.println("!!!!!!不会滑翔");
	}

	@Override
	public void fly() {
		System.out.println("!!!!!不会飞");
	}
}
