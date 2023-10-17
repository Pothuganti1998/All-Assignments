package Assignment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Shuffle the array
public class Shuffle_array {
	public static int[] doSuffleArray(int[] A) {

		Random r = new Random();
		int temp = 0, j = 0;
		for (int i = 0; i < A.length - 1; i++) {
			j = r.nextInt(i + 2);
			temp = A[j];
			A[j] = A[j + 1];
			A[j + 1] = temp;
		}
		return A;
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] B = doSuffleArray(a);
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
	}

}
