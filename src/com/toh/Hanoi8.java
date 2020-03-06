package com.toh;

public class Hanoi8 {
	// n disks and 8 pegs
	static void hanoi8(int n, char from, char to, char aux1, char aux2, char aux3, char aux4, char aux5, char aux6) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}

		hanoi8(n - 6, from, aux1, aux2, aux3, aux4, aux5, aux6, to);
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
		hanoi8(n - 6, aux1, to, from, aux2, aux3, aux4, aux5, aux6);

		// Time complexity is O(2^(n^(1/6)) this is from presumed optimal moves
	}
}
