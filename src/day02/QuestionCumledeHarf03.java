package day02;

import java.util.Scanner;

public class QuestionCumledeHarf03 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf alin ve cumlede harfin kac kez kullanildigini
		 * bulup yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().toLowerCase().charAt(0);
		int count=0;
		for (int i = 0; i <cumle.length(); i++) {
			if(cumle.charAt(i)==harf) {
				count++;
			}
			
			
			
			
			
			
		}
		
		System.out.println("Girdiginiz cumlede "+ harf+ " harfi "+ count+" kere kullanilmistir");
		
	scan.close();	
	}

}
