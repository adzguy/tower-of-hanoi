package com.toh;

public class Hanoi5 {
	// n disks and 5 pegs
		static void hanoi5(int n, char from, char to, char aux1, char aux2, char aux3) {
			
		// Check for zero number of disk
		if (n == 0)
			return;
		
		// Check for one number of disk
		if (n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}
			
		hanoi5(n - 3, from, aux1, aux2, aux3, to); // T(n-3, pegs) moves
		System.out.println("Move disk " + (n - 2) + " from " + from + " to " + aux3); // T(1)
		System.out.println("Move disk " + (n - 1) + " from " + from + " to " + aux2); // T(1)
		System.out.println("Move disk " + n + " from " + from + " to " + to); 		  // T(1)
		System.out.println("Move disk " + (n - 1) + " from " + aux2 + " to " + to);   // T(1)
		System.out.println("Move disk " + (n - 2) + " from " + aux3 + " to " + to);   // T(1)
		hanoi5(n - 3, aux1, to, from, aux2, aux3); // T(n-3, pegs) moves

		// Time complexity is O(2^(n^(1/3)) this is from presumed optimal moves
			

			

			
			
//			// Pick k disks between 1 and n-1 for resumed optimal solution 
//			int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
//			
//			hanoi5(k, from, aux1, aux2, aux3, to); 
//			System.out.println("Move disk " + (k + 2) + " from " + from + " to " + to); 
//			
//			Hanoi4.hanoi4(n-k, from, to, aux1, aux2);
//			
//			System.out.println("Move disk " + (k + 2) + " from " + aux2 + " to " + to);    
//			hanoi5(k, aux1, to, from, aux2, aux3); 
			
		}
}
