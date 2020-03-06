package com.toh;

public class Hanoi7 {
	
	// n disks and 7 pegs
	static void hanoi7(int n, char from, char to, char aux1, char aux2, char aux3, char aux4, char aux5) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}

		hanoi7(n - 5, from, aux1, aux2, aux3, aux4, aux5, to);
		System.out.println("Move disk " + (n - 4) + " from " + from + " to " + aux5);
		System.out.println("Move disk " + (n - 3) + " from " + from + " to " + aux4);
		System.out.println("Move disk " + (n - 2) + " from " + from + " to " + aux3);
		System.out.println("Move disk " + (n - 1) + " from " + from + " to " + aux2);
		System.out.println("Move disk " + n + " from " + from + " to " + to);
		System.out.println("Move disk " + (n - 1) + " from " + aux2 + " to " + to);
		System.out.println("Move disk " + (n - 2) + " from " + aux3 + " to " + to);
		System.out.println("Move disk " + (n - 3) + " from " + aux4 + " to " + to);
		System.out.println("Move disk " + (n - 4) + " from " + aux5 + " to " + to);
		hanoi7(n - 5, aux1, to, from, aux2, aux3, aux4, aux5);

		// Time complexity is O(2^(n^(1/5)) this is from presumed optimal moves
	}
}
