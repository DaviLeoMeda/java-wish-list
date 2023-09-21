package org.java.gifts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class es1 {

	
	public static void main(String[] args) {
		
		
		List<String> gifts = new ArrayList<>();
		List<String> destination = new ArrayList<>();
		
		destination.add("--> regalo per la mamma");
		destination.add("--> regalo per il nonno");
		destination.add("--> regalo per la zia");
		destination.add("--> regalo per il babbo");
		destination.add("--> regalo per la nonna");
		
		
		Boolean closeIt= false;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(closeIt.equals(false)) {
			
			System.out.println("Inserisci i nome del regalo che vuoi nella lista: ");
			String oneGift = sc.nextLine();
			
			Random random = new Random();
			
			
			int randomGifNum = random.nextInt(destination.size());
			String comment = destination.get(randomGifNum);
			
			
			gifts.add(oneGift + "" + comment);
			
				
			System.out.println("Il numero di regali nella lista è: " + gifts.size());
			
			System.out.println("Inserisci Y se vuoi continuare con la lista o N se vuoi terminare: (Y/N) ");
			String closing = sc.nextLine();
			
			if(closing.toLowerCase().equals("n")) {
				closeIt=true;
			} 
				
			}
			
			sc.close();
			
			System.out.println(gifts);
			

			
			
		}
		
		
		
		
	}


