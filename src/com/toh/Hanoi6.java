package com.toh;

public class Hanoi6 {
	// n disks and 6 pegs
	static void hanoi6(int n, char from, char to, char aux1, char aux2, char aux3, char aux4) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}
		
		hanoi6(n - 4, from, aux1, aux2, aux3, aux4, to);
		System.out.println("Move disk " + (n - 3) + " from " + from + " to " + aux4);
		System.out.println("Move disk " + (n - 2) + " from " + from + " to " + aux3);
		System.out.println("Move disk " + (n - 1) + " from " + from + " to " + aux2);
		System.out.println("Move disk " + n + " from " + from + " to " + to);
		System.out.println("Move disk " + (n - 1) + " from " + aux2 + " to " + to);
		System.out.println("Move disk " + (n - 2) + " from " + aux3 + " to " + to);
		System.out.println("Move disk " + (n - 3) + " from " + aux4 + " to " + to);
		hanoi6(n - 4, aux1, to, from, aux2, aux3, aux4);
		
		// Time complexity is O(2^(n^(1/4)) this is from presumed optimal moves
		
	}
}
