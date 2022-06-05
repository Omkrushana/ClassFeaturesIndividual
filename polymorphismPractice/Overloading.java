package polymorphismPractice;

public class Overloading {
	static int b5 = 100;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 50;
		int addition = add(String.valueOf(a), String.valueOf(b));
		System.out.println(addition);
	}

	static int add(int a, int b) {
		System.out.println("ab method");
		int addition = a + b;
		return addition;
	}

	static int add(String a, String b) {
		System.out.println("ab String method");
		String additionString = a + b;
		int addition = additionString.length();
		return addition;
	}

	static int add(int a, int b, int c) {
		System.out.println("abc method");
		int addition = a + b + c;
		return addition;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("abcd method");
		int addition = a + b + c + d;
		return addition;
	}

}
