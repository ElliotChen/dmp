package tw.elliot.dmp.isp.better;

public class PetDog implements Huntable, Runnable {

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
}
