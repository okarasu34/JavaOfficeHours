package day02;


import java.util.Scanner;

public class QuestionFaktoriyel04 {

	public static void main(String[] args) {
		
        int faktoriyel=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
        System.out.println(sayi + " nin faktoriyeli :" + faktoriyel+ " dir.");	
        scan.close();
		}
			  

	}


