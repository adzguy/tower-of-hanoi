package com.toh;

import java.util.Scanner;

public class TowerOfHanoi {
	private Scanner kb;
	private int numberOfTowers;
	private int numberOfDisks;

	public TowerOfHanoi() {
		
		// Call a method asking for the number of towers
		this.numberOfTowers = setNumberOfTowers();
		
		// Call a method asking for the number of towers
		this.numberOfDisks = setNumberOfDisks();
		System.out.println();
	}
	
	// Ask the number of towers 
	private int setNumberOfTowers() {
		
		try {
			
			kb = new Scanner(System.in);
			System.out.print("Enter number of towers/pegs: ");
			numberOfTowers = kb.nextInt();

			while(numberOfTowers < 5 || numberOfTowers > 10 ) {
				System.out.println("Please enter number between 5 and 10");
				System.out.print("Enter number of towers/pegs: ");
				numberOfTowers = kb.nextInt();
			}
			
		} catch(Exception e) {
			
			System.out.print("Error occured");
			
		}
		
		return numberOfTowers;
	}
	
	// Ask the number of disks
	private int setNumberOfDisks() {
		
		try {
			
			kb = new Scanner(System.in);
			System.out.print("Enter number of disks: ");
			numberOfDisks = kb.nextInt();

			while(numberOfDisks < 3 || numberOfDisks > 40) {
				System.out.println("Please enter number between 3 and 40: ");
				System.out.print("Enter number of disks: ");
				numberOfDisks = kb.nextInt();
			}
			
		} catch(Exception e) {
			
			System.out.print("Error occured");
			
		}
		
		return numberOfDisks;
	}
	
	// Get the number of towers or pegs
	public int getNumberOfTowers() {
		return numberOfTowers;
	}
	
	// Get the number of disks
	public int getNumberOfDisks() {
		return numberOfDisks;
	}

}
