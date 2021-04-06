package day01;

import java.util.Scanner;

public class Question03 {

	/*Soru3:Kullanicidan uc basamakli bir sayi aliniz ve sayinin rakamlarini birler, onlar ve yuzler 
	 * basamagi olarak yazdirin. 
	 * 
	 */
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen uc basamakli bir sayi giriniz.");
	int sayi=scan.nextInt();
	int yuzler=sayi/100, onlar=sayi/10%10,birler=sayi%10;
	if(sayi>99&&sayi<1000) {
		System.out.println(yuzler+" "+onlar+" "+birler);
	}else {
		System.out.println("lutfen uc basamakli bir sayi giriniz.");
		scan.close();
	}
	
	
	
	
	
	
}
}
