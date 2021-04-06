package day02;

import java.util.Scanner;

public class FaktoriyelMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		
		int a=5;
	
		
		
		
	}

	
	
	public static void faktoriyel(int sayi) {
		int carpim=1;
		for (int i = sayi; i>0; i--) {
			carpim*=i;
			
			
		}
		System.out.println("Girilen sayinin faktoriyeli: "+carpim);
	}
}
