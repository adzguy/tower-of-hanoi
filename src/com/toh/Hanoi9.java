package com.toh;

public class Hanoi9 {
	// n disks and 9 pegs
	static void hanoi9(int n, char from, char to, char aux1, char aux2, char aux3, char aux4, char aux5, char aux6, char aux7) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}

		hanoi9(n - 7, from, aux1, aux2, aux3, aux4, aux5, aux6, aux7, to);
		System.out.println("Move disk " + (n - 6) + " from " + from + " to " + aux7);
		System.out.println("Move disk " + (n - 5) + " from " + from + " to " + aux6);
		System.out.println("Move disk " + (n - 4) + " from " + from + " to " + aux5);
		System.out.println("Move disk " + (n - 3) + " from " + from + " to " + aux4);
		System.out.println("Move disk " + (n - 2) + " from " + from + " to " + aux3);
		System.out.println("Move disk " + (n - 1) + " from " + from + " to " + aux2);
		System.out.println("Move disk " + n + " from " + from + " to " + to);
		System.out.println("Move disk " + (n - 1) + " from " + aux2 + " to " + to);
		System.out.println("Move disk " + (n - 2) + " from " + aux3 + " to " + to);
		System.out.println("Move disk " + (n - 3) + " from " + aux4 + " to " + to);
		System.out.println("Move disk " + (n - 4) + " from " + aux5 + " to " + to);
		System.out.println("Move disk " + (n - 5) + " from " + aux6 + " to " + to);
		System.out.println("Move disk " + (n - 6) + " from " + aux7 + " to " + to);
		hanoi9(n - 7, aux1, to, from, aux2, aux3, aux4, aux5, aux6, aux7);

		// Time complexity is O(2^(n^(1/7)) this is from presumed optimal moves
	}
}
