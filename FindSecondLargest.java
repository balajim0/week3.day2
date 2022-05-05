package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> asList = Arrays.asList(data);
		// 1) Arrange the array in ascending order
		Collections.sort(asList);
		System.out.println(asList);
		/*
		 * Pseudo Code:
		 * 
		 * 2) Pick the 2nd element from the last and print it
		 */
		int size = asList.size() - 2;
		System.out.println(asList.get(size));

	}
}
