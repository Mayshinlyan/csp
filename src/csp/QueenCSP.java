package csp;

import java.util.Scanner;

public class QueenCSP extends CSP {

	public static int n = 0;
	public static final String[] varArray = new String[] {"Q1","Q2","Q3","Q4","Q5","Q6","Q7","Q8"};

	public QueenCSP(int n) {
		initializeVariable(n);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Queens");
		n = scan.nextInt();
		QueenCSP queen = new QueenCSP(n);
		
		

		


	}
	
	public void initializeVariable(int n) {
		for(int i=0;i<n;i++) {
			addVariable(new Variable(varArray[i]));
		}
	}




}

