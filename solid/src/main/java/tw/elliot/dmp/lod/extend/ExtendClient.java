package tw.elliot.dmp.lod.extend;

public class ExtendClient {

	public static void main(String[] args) {
		IContainer container = new Container();
		Person person = new Person();

		person.shutdown(container);

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
