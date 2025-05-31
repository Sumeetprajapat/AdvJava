package polymorphism;

public class Test {
	public static void main(String[] args) {
		Area aa = new Area();
		int x = aa.area(5);
		int y = aa.area(12, 23);
		System.out.println(x);
		System.out.println(y);
	}
}
