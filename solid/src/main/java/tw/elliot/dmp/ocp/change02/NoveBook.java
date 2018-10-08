package tw.elliot.dmp.ocp.change02;

/**
 * 小说类书籍
 */
public class NoveBook implements IBook {
	private String name;
	private float price;
	private String author;

	public NoveBook(String name, float price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}


	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getPrice() {
		return this.price > 40.0f ? this.price*0.8f: this.price*0.9f;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}
}
