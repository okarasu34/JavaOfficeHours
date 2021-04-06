package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemnlariFarki {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kac elemanli bir array olusturmak istiyoruz");
		int size=scan.nextInt();
		int sayilar[]=new int[size];
		for (int i = 0; i <sayilar.length; i++) {
			System.out.println("Lutfen Array'in " + (i+1)+ " .ci elemanini giriniz.");
			sayilar[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(sayilar));
		Arrays.sort(sayilar);
		System.out.println(Arrays.toString(sayilar));
		

	}

}
