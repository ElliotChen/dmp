package tw.elliot.dmp.lod.bad;

public class Computer {
	public void saveCurrentTask() {
		System.out.println("Save Task");
	}
	public void closeService() {
		System.out.println("Close Service");
	}
	public void closeScreen() {
		System.out.println("Close Screen");
	}
	public void closePower() {
		System.out.println("Close Power");
	}

	public void close() {
		this.saveCurrentTask();
		this.closeService();
		this.closeScreen();
		this.closePower();
	}
}
