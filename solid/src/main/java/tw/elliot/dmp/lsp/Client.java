package tw.elliot.dmp.lsp;

public class Client {

	public static void main(String[] args) {
		System.out.println("正常的A");
		A a = new A();

		System.out.println("100-50 = " + a.sub(100,50));
		System.out.println("100-80 = " + a.sub(100,80));

		System.out.println("因B override A的sub method（非抽象方法），造成非予期的结果");
		B b = new B();
		System.out.println("100-50 = " + b.sub(100,50));
		System.out.println("100-80 = " + b.sub(100,80));
		System.out.println("100-20+100 = " + b.add100(100,20));
	}
}
