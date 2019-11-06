package com.wyz.data;

public class FlowerNumber {

	public static void main(String[] args) {
		int i, x, y, z, t;
		for (i = 1000; i < 10000; i++) {
			x = i % 10;
			y = i / 10 % 10;
			z = i / 100 % 10;
			t = i / 1000 % 10;

			if (i == (x * x * x * x + y * y * y * y + z * z * z * z + t * t * t * t)) {
				// System.out.println(x + ": " + y + ":" + z);
				System.out.printf("%d\n", i);
			}

		}

	}

}
