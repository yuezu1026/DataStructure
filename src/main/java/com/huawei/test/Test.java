package com.huawei.test;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int m, n;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			int[][] in = new int[m][n];
			int[][] dis = new int[m][n];
			for (int i = 0; i < in.length; i++) {
				for (int j = 0; j < in[0].length; j++) {
					in[i][j] = scanner.nextInt();
					dis[i][j] = 0;
				}
			}

			for (int i = 0; i < in.length; i++) {
				for (int j = 0; j < in[0].length; j++) {
					if (i == 0 && j == 0) {
						dis[i][j] = in[i][j];
					} else if (i == 0 && j != 0) {
						dis[i][j] = dis[i][j - 1] + in[i][j];
					} else if (i != 0 && j == 0) {
						dis[i][j] = dis[i - 1][j] + in[i][j];
					} else {
						dis[i][j] = (dis[i - 1][j] > dis[i][j - 1] ? dis[i - 1][j] : dis[i][j - 1]) + in[i][j];
					}
					System.out.println(dis[i][j]);
				}
			}
			System.out.println(dis[m - 1][n - 1] + "\r");
		}

	}
}
