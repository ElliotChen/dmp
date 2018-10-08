package tw.elliot.dmp.lod.bad;

public class BadClient {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Person person = new Person();

		person.shutdownComputer(computer);

		/*
		执行结果
		Save Task
		Close Screen
		Close Power
		Save Task
		Close Service
		Close Screen
		Close Power

		发现Save Task, Close Screen, Close Power都被执行了不止一次
		 */

	}
}
