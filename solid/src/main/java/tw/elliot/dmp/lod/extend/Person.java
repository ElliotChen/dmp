package tw.elliot.dmp.lod.extend;

public class Person {

	public void shutdown(IContainer container) {
		container.sendCloseCommand();
	}
}
