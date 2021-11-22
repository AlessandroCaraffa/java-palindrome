package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual'è la parola da analizzare?");
		String parola = scan.nextLine();
		String parolaBackwords ="";
		for (int i =parola.length() -1 ; i >= 0 ;i--) {
			parolaBackwords += parola.charAt(i) ;
		}
		if (parolaBackwords.equals(parola)) {
			System.out.println("La parola è un palindromo,ed è lunga " + parola.length() + " caratteri." );
		}else {
			System.out.println("La parola non è un palindromo.");
		}
//		System.out.println(parolaBackwords);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
