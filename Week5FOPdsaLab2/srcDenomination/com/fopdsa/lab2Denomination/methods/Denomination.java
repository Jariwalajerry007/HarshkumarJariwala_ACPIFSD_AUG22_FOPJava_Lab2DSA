package com.fopdsa.lab2Denomination.methods;

public class Denomination{
	public void noofNotes(int[] count, int amount) {
		int[] result = new int[count.length];
		for (int i = 0; i < count.length; i++) {
			if (count[i] <= amount) {
				result[i] = amount / count[i];
				amount = amount % count[i];
			}
		}
		if (amount > 0) {
			System.out.println("Amount cannot be made with Denominaion");
		} else {
			System.out.println("Your payment approach in order to give minimum number of notes will be");
			for (int i = 0; i < result.length; i++) {
				if (result[i] != 0) {
					System.out.println(count[i] + ":" + result[i]);
				}
			}
		
		}
	}

	public void bubbleSort(int[] Currency) {
		for (int i = 0; i < Currency.length - 1; i++) {
			for (int j = 0; j < Currency.length - i - 1; j++) {
				if (Currency[j] < Currency[j + 1]) {
					int temp = Currency[j];
					Currency[j] = Currency[j + 1];
					Currency[j + 1] = temp;
				}
			}
		}
	}
}