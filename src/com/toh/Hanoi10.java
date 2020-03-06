package com.toh;

public class Hanoi10 {
	// n disks and 10 pegs
	static void hanoi10(int n, char from, char to, char aux1, char aux2, char aux3, char aux4, char aux5, char aux6, char aux7, char aux8) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}
			
		// Transfer (recursively) 
		hanoi10(n - 8, from, aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, to);
		System.out.println("Move disk " + (n - 7) + " from " + from + " to " + aux8);
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
		System.out.println("Move disk " + (n - 7) + " from " + aux8 + " to " + to);
		hanoi10(n - 8, aux1, to, from, aux2, aux3, aux4, aux5, aux6, aux7, aux8);

		// Time complexity: O(2^(n^(1/8)) this is from presumed optimal moves
	}
}
