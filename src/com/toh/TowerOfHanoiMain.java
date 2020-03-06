package com.toh;

public class TowerOfHanoiMain {

	public static void main(String[] args) {
		
		TowerOfHanoi toh = new TowerOfHanoi();
		
		// Collection of characters for towers or pegs 
		char[] pegs = new char[toh.getNumberOfTowers()];
		for(int i=0; i<pegs.length; i++) {
			int k = 'A'+i;
			pegs[i] = (char)k;
		}
		
		if (pegs.length == 5) {
			Hanoi5.hanoi5(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4]);
		} else if (pegs.length == 6) {
			Hanoi6.hanoi6(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4], pegs[5]);
		} else if (pegs.length == 7) {
			Hanoi7.hanoi7(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4], pegs[5], pegs[6]);
		} else if (pegs.length == 8) {
			Hanoi8.hanoi8(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4], pegs[5], pegs[6], pegs[7]);
		} else if (pegs.length == 9) {
			Hanoi9.hanoi9(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4], pegs[5], pegs[6], pegs[7], pegs[8]);
		} else if (pegs.length == 10){
			Hanoi10.hanoi10(toh.getNumberOfDisks(), pegs[0], pegs[1], pegs[2], pegs[3], pegs[4], pegs[5], pegs[6], pegs[7], pegs[8], pegs[9]);
		}

	}

}
