package tw.elliot.dmp.lod.better;

public class Computer {
	private void saveCurrentTask() {
		System.out.println("Save Task");
	}
	private void closeService() {
		System.out.println("Close Service");
	}
	private void closeScreen() {
		System.out.println("Close Screen");
	}
	private void closePower() {
		System.out.println("Close Power");
	}

	public void close() {
		this.saveCurrentTask();
		this.closeService();
		this.closeScreen();
		this.closePower();
	}
}
