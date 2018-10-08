package tw.elliot.dmp.ocp.original;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
	private static final ArrayList<NoveBook> bookList = new ArrayList<>();

	static {
		bookList.add(new NoveBook("天龙八部",32.0f, "金庸"));
		bookList.add(new NoveBook("巴㴝圣母院",56.0f, "雨果"));
		bookList.add(new NoveBook("悲惨世界",35.0f, "雨果"));
		bookList.add(new NoveBook("金瓶梅",43.0f, "兰陵笑笑生"));
	}

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCurrencyInstance();

		format.setMaximumFractionDigits(2);

		System.out.println("－－－－－售出书籍记录如下－－－－－－－－");
		for (IBook book : bookList) {
			System.out.println("书籍名称["+book.getName()+"] 书籍作者["+book.getAuthor()+"] 书籍价格["+format.format(book.getPrice())+"]");
		}
	}
}
