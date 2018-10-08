package tw.elliot.dmp.lod.extend;

public class Container implements IContainer {
	private ISystem system = new Computer();

	@Override
	public void sendCloseCommand() {
		system.close();
	}
}
