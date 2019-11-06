package com.wyz.matrix;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		System.out.println("row:" + row + " column:" + col);
		// set value
		double data[][] = new double[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				double d = scan.nextDouble();
				data[i][j] = d;
			}
		}
		Matrix matrix = new Matrix(row, col, data);
		int srow = scan.nextInt();
		int scol = scan.nextInt();
		double sv = scan.nextDouble();
		System.out.println("after set value:");
		matrix.setMatrix(srow, scol, sv);
		System.out.print(matrix);
		// get value
		DecimalFormat df = new DecimalFormat("0");
		int vrow = scan.nextInt();
		int vcol = scan.nextInt();
		System.out.print("value on (" + vrow + "," + vcol + "):");
		System.out.println(df.format(matrix.getMatrix(vrow, vcol)));
		// add
		int addrow = scan.nextInt();
		int addcol = scan.nextInt();
		double addMatrix[][] = new double[addrow][addcol];
		for (int i = 0; i < addrow; i++) {
			for (int j = 0; j < addcol; j++) {
				double ad = scan.nextDouble();
				addMatrix[i][j] = ad;
			}
		}

		Matrix add = new Matrix(addrow, addcol, addMatrix);
		System.out.print(matrix.add(add));
		// //mul
		int mulrow = scan.nextInt();
		int mulcol = scan.nextInt();
		double mulMatrix[][] = new double[mulrow][mulcol];
		for (int i = 0; i < mulrow; i++) {
			for (int j = 0; j < mulcol; j++) {
				double mu = scan.nextDouble();
				mulMatrix[i][j] = mu;
			}
		}
		Matrix mul = new Matrix(mulrow, mulcol, mulMatrix);
		// System.out.print(matrix.add(add));
		System.out.print(matrix.multiply(mul));
		// transpose
		System.out.print(matrix.transpose());

		scan.close();
	}
}