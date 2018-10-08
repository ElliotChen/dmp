package tw.elliot.dmp.lod.better;

public class BetterClient {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Person person = new Person();

		person.shutdownComputer(computer);

		/*
		执行结果
		Save Task
		Close Service
		Close Screen
		Close Power

		发现Save Task, Close Screen, Close Power都被仅被执行一次
		 */

	}
}
