package com.wyz.data;

public class PrimeNumber {
	public static void main(String[] argv) {
		int i, j;
		int count = 0;

		for (i = 2; i <= 200; i++) {
			for (j = 2; j < i; j++) {
				// 如果j能被i整出在跳出循环
				if (i % j == 0)
					break;
			}
			// 判断循环是否提前跳出，如果j<i说明在2~j之间,i有可整出的数
			if (j >= i) {
				count++;
				System.out.printf("%d, ", i);

				// 换行，用count计数，每五个数换行
				if (count % 5 == 0)
					System.out.printf("\n");
			}
		}

		// 因为153=1的三次方＋5的三次方＋3的三次方。
		int s = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3;
		System.out.println("\n");
		System.out.println(s);
	}
}
