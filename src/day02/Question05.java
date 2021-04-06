package day02;

import java.util.Scanner;

public class Question05 {
	
	/*Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir
	 * ternary kullanarak harflerin farkli olup olmadigina bakiniz.
	 */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 harfli bir isim giriniz.");
		String isim=scan.next();
		char c1=isim.charAt(0);
		char c2=isim.charAt(1);
		char c3=isim.charAt(2);
		String result=isim.length()==3&&(c1!=c2&&c1!=c3&&c2!=c3) ? " girdiginiz string ve unik karakterlere sahip" : "girdiginiz isim unik degil";
		System.out.println(result);
		scan.close();
		
		
		
		

	}

}
