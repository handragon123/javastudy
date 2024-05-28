package javaapipkg;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random r1 = new Random(42); // seed값: random값을고정시켜줌
		Random r2 = new Random(42); // seed값: random값을고정시켜줌
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
	}
}
