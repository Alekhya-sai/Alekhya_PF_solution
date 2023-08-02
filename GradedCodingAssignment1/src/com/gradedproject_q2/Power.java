package com.gradedproject_q2;

import java.util.Scanner;

public class Power {

	public int calculate(int x, int n) {
		if (n == 0) {
			return 1;
		}

		if (n == 1) {
			return x;
		}

		int temp = calculate(x, n / 2);

		if (n % 2 == 0) {
			return temp * temp;
		} else {
			return x * temp * temp;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Power p = new Power();

		System.out.println("Enter the base number X: ");
		int x = sc.nextInt();

		System.out.println("Enter the power N: ");
		int n = sc.nextInt();

		System.out.print("X power N is: ");
		System.out.println(p.calculate(x, n));
	}

}

