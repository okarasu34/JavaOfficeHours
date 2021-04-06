package day02;

import java.util.Scanner;

/*Bir sayinin kendisi haric bolenlerinin toplami kendisine esit olan sayilar 
 * mukemmel sayi olarak ifade edilir.
 */
      


public class QuestionMukemmelSayi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println(checkPerfectNumber(sayi));;
	      String result=checkPerfectNumber(sayi)? " sayi mukemmel sayidir": "sayi mukemmel sayi degildir";
		
		
		
	}
	public static boolean checkPerfectNumber(int sayi) {
		int toplam=0;
		boolean flag=false;
		for (int i = 1; i <sayi; i++) {
			if(sayi%i==0) {
				toplam=toplam+1;
			}
	
		}if(toplam==sayi) {
			flag=true;
		}
		return flag;
	}
	
	
	
	
}
