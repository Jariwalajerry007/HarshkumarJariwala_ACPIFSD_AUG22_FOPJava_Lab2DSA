package com.fopdsa.lab2PaymoneyMain;

import java.util.Scanner;

import com.fopdsa.lab2Paymoneytransaction.Transaction;

public class Main {

	public static void main(String[] args) {
		Transaction tr = new Transaction();
		
		 //Sc as scanner object, input from user
		
		try (Scanner sc = new Scanner(System.in)) {
		
			int sizeAr;
			System.out.println("Enter the size of transaction array"); // Intializing Size of Transaction as per user input
			sizeAr = sc.nextInt();						
			System.out.println("Enter the values of array");   //Asking Amounts paid in Size of Transaction ..if Size is 6 it will take values for {0,1,2,3,4,5} 0th to 5th i.e total 6 Amounts 
			int[] volume = new int[sizeAr];
			for (int i = 0; i < sizeAr; i++) {
				volume[i] = sc.nextInt();
			}
			System.out.println("Enter the total number of targets that need to be achieved"); //input for Targeted targets
			int target = sc.nextInt();
			for (int i = 0; i < target; i++) {
				System.out.println("Enter the value of target"); //Target to achieve
				int value = sc.nextInt();
				tr.Successful(value, volume);
			}
		}
	}

}
