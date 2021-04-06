package day01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz.");
		char karakter=scan.next().charAt(0);
		
		System.out.println(karakter+0);
		scan.close();
	}

}
