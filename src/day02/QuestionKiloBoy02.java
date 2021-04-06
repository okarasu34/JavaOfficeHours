package day02;

import java.util.Scanner;

public class QuestionKiloBoy02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("lutfen boyunuzu cm olarak giriniz.");
			double boy=scan.nextDouble();
			System.out.println("lutfen kilonuzu kg olarak giriniz.");
			double kilo=scan.nextDouble();
			boy/=100;
			double vke=kilo/(boy*boy);
			System.out.println(vke);
			
		
		
	}

}
