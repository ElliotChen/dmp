package tw.elliot.dmp.lod.bad;

public class Person {

	public void shutdownComputer(Computer computer) {
		computer.saveCurrentTask();
		computer.closeScreen();
		computer.closePower();
		computer.close();

	}
}
