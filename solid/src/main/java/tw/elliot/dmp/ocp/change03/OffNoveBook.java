package tw.elliot.dmp.ocp.change03;

public class OffNoveBook extends NoveBook {

	public OffNoveBook(String name, float price, String author) {
		super(name, price, author);
	}

	@Override
	public float getPrice() {
		return super.getPrice() > 40.0f ? super.getPrice()*0.8f: super.getPrice()*0.9f;
	}
}
