package tw.elliot.dmp.lsp;

public class B extends A {
	public int sub(int a, int b) {
		return a + b;
	}

	public int add100(int a, int b) {
		return sub(a,b) + 100;
	}
}
