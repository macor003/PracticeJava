package com.macor.CodeWars;

import java.util.ArrayList;

public class Codility {

	public static void main(String[] args) {

		int n = 1041;

		System.out.println("Binary --->> " + Integer.toBinaryString(n));

		int solution = solution(n);

		System.out.println("Binary Gap --->> " + solution);

	}

	private static int solution(int n) {

		int count = 0;
		int numeroMayor = 0;
		ArrayList<Integer> arrayCounts = new ArrayList<Integer>();

		if (n > 0) {
			String binary = Integer.toBinaryString(n);

			for (int i = 0; i < binary.length(); i++) {
				if ('0' == binary.charAt(i)) {
					count++;
				} else {
					arrayCounts.add(count);
					count = 0;
				}
			}
			numeroMayor = arrayCounts.get(0);
			for (int i = 0; i < arrayCounts.size(); i++) {

				if (arrayCounts.get(i) > numeroMayor) {
					numeroMayor = arrayCounts.get(i);
				}
			}

		}
		return numeroMayor;

	}

}

// Task description
// A binary gap within a positive integer N is any maximal sequence of
// consecutive zeros that is surrounded by ones at both ends in the binary
// representation of N.
//
// For example, number 9 has binary representation 1001 and contains a binary
// gap of length 2. The number 529 has binary representation 1000010001 and
// contains two binary gaps: one of length 4 and one of length 3. The number 20
// has binary representation 10100 and contains one binary gap of length 1. The
// number 15 has binary representation 1111 and has no binary gaps.
//
// Write a function:
//
// class Solution { public int solution(int N); }
//
// that, given a positive integer N, returns the length of its longest binary
// gap. The function should return 0 if N doesn't contain a binary gap.
//
// For example, given N = 1041 the function should return 5, because N has
// binary representation 10000010001 and so its longest binary gap is of length
// 5.
//
// Assume that:
//
// N is an integer within the range [1..2,147,483,647].
// Complexity:
//
// expected worst-case time complexity is O(log(N));
// expected worst-case space complexity is O(1).
