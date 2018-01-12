package com.macor.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumConsecutives {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);
		List<Integer> s = new LinkedList<Integer>(l);
		List<Integer> resultado = new ArrayList<Integer>();
		int sum = 0;
		int base = 0;

		for (int i = 0; i <= s.size() - 1; i++) {

			int actual = s.get(i);
			int siguiente = s.get(i) + 1;

			System.out.println("-----------------------");
			System.out.println("Valor: " + actual);
			System.out.println("Base:  " + base);

			if (actual == s.size() - 1) {
				resultado.add(i, s.get(i));
			} else if (actual == siguiente) {
				base = actual;
				sum = (actual + siguiente);
				resultado.add(i, sum);
				s.remove(i);
			} else {
				resultado.add(i, s.get(i));
			}
		}
		System.out.println(resultado);

	}

}
