package day04;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionArrays01 {
	
	

	    public static void main    (String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz.");
		String isim=scan.next();
				

	}
          public static void charadonustur( String isim){
			char harfler[]=new char[isim.length()];
			for (int i = 0; i < isim.length(); i++) {
				harfler[i]=isim.charAt(i);
				
			}
			
			System.out.println(Arrays.toString(harfler));	
}
}