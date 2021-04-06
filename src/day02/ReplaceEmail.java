package day02;

import java.util.Scanner;

public class ReplaceEmail {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir email adresi giriniz");
	String email=scan.next();
	if(email.contains("hotmail")) {
		email=email.replaceAll("hotmail", "gmail");
		
	}
	
	System.out.println(email);	
		
		
		

	}

}
