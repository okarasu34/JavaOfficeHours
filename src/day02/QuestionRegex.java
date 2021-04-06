package day02;

import java.util.Scanner;

public class QuestionRegex {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir isim giriniz");
		String isim=scan.next();
		System.out.println("Lutfen bir soyisim giriniz");
		String soyisim=scan.next();
		System.out.println("Lutfen bir kart numarasi giriniz");
		String kart=scan.next();
		if(kart.length()==16) {
			isim=isim.substring(0, 1).toUpperCase()+isim.replaceAll("\\w","*");
			soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.replaceAll("\\w","*");
			kart="**** **** ****"+ kart.substring(kart.length()-4);
		}else {
			System.out.println("16 haneli bir kart numarasi giriniz.");
		}
		
		System.out.println("isim: "+ isim+ " "+soyisim+" "+ kart);
		scan.close();
		
	}

}
