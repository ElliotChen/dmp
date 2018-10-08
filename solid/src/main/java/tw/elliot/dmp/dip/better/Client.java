package tw.elliot.dmp.dip.better;

public class Client {

	public static void main(String[] args) {
		Mother mother = new Mother();
		Book book = new Book();
		Newspaper newspaper = new Newspaper();

		//妈妈会读书
		mother.narrate(book);
		//妈妈也会读报纸
		mother.narrate(newspaper);
	}
}
