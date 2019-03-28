package Patterns;

//*
//**
//***
//****
//***
//**
//*

public class Pattern14 {
	public static void main(String[] args) {
		p1();
		System.out.println("---------------");
		p2();
		System.out.println("---------------");
		p3();
	}

	static void p1() {
		int n = 4, condition = 1;
		for (int i = 1; i < 2 * n; i++) {
			if (i > n) {
				--condition;
			} else {
				condition = i;
			}
			for (int j = 1; j <= condition; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	static void p2() {
		int n, temp, condition;
		n = 4;
		temp = n;
		for (int i = 1; i < n * 2; i++) {
			condition = i > n ? --temp : i;
			for (int j = 1; j <= condition; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void p3() {
		int size = 3;
		for (int i = size; i >= -size; i--) {
			for (int j = size; j >= Math.abs(i); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
