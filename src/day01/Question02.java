package day01;

import java.util.Scanner;

public class Question02 {
	/*Soru2: Kullanicidan Y/N ikilisini girdiginde girdigi degeri ekrana yazdiran 
	 * java kodunu yazdirin. 
	 */
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen Y/N ikilisinden birini giriniz.");
		char input=scan.next().charAt(0);
				if(input=='Y'||input=='y') {
					System.out.println("Yes");
					
				}else if(input=='N'||input=='n') {
					System.out.println("No");
					
				}else {
					System.out.println("girilen deger yanlis tekrar giriniz.");
					scan.close();
				}
		

	}

}
