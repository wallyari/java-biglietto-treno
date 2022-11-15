package org.booleancareer.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// init scanner
		Scanner scanner = new Scanner(System.in);
		//input vars: età del passegero e km che deve percorrere in treno
		int age;
		double km;
		double price = 0.21;
		
		//scritte che appaiono all'utente per calcolare il prezzo del viaggio
		System.out.println("Inserire età del passeggero");
		age = scanner.nextInt() ; 
		System.out.println("Inserire numero di km da percorrere");
		km = scanner.nextDouble() ; 
		
		//debug
				System.out.println("Age :" + age);
				System.out.println("km :" + km);
				
				
		//calcolo del prezzo del viaggio con le seguenti regole:
		//prezzo base che ottengo moltiplicando i km da percorrere per 0.21 euro		
		//per minorenni sconto del 20% che si traduce in (moltiplico prezzo base per 0.8)
		//per gli over 65 sconto del 40% che si traduce in (moltiplico prezzo base per 0.6)
				
		if(age < 18) {
			System.out.println("Prezzo del biglietto:" + (km * price * 0.8) + "euro");
		} else if(age >= 65) {
			System.out.println("Prezzo del biglietto:" + (km * price * 0.6) + "euro");
		} else if(age >=18 && age <=64) {
			System.out.println("Prezzo del biglietto:" + (km * price) + "euro");
		}		
				
		
				//close scanner
				scanner.close();
				
	}

}
