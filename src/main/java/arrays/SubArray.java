package arrays;

import java.util.Scanner;

/**
 * Author: Prasant
 * Date: 02/11/24
 */

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		int[] nums = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++){
			for (int j = i; j < nums.length; j++){

				for (int k = i; k <= j; k++){
					System.out.print(nums[k] + " ");
				}

				System.out.println();
			}
		}
	}
}
