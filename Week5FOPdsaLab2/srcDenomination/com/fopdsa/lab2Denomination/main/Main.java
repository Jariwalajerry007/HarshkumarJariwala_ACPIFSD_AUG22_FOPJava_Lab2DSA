package com.fopdsa.lab2Denomination.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Denomination denomination = new Denomination();
		try (Scanner sc = new Scanner(System.in)) {
			int noofdenomie;
			System.out.println("Enter the size of Currency Denominations");
			noofdenomie = sc.nextInt();
			System.out.println("Enter the Currency Denomination Value");
			
			//int valueOfdenomie;
			int[] value = new int[noofdenomie];
			for (int i = 0; i < noofdenomie; i++) {
				value[i] = sc.nextInt();

			}
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			denomination.bubbleSort(value);
			denomination.noofNotes(value, amount);
		}
	}

}
