package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen byte veri tipinde bir deger giriniz.");
		byte byteData=scan.nextByte();
		System.out.println("girdiginiz byte veri tipindeki deger: "+byteData);
		System.out.println("Lutfen short veri tipinde bir deger giriniz.");
		byte shortData=scan.nextByte();
		System.out.println("girdiginiz byte veri tipindeki deger: "+shortData);
		
		
		scan.close();
	}

}
