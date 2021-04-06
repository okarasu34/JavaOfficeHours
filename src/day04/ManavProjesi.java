package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProjesi {
	
	static List<String> urunIsimleri=new ArrayList<>();
	static List<Double> urunFiyatlari=new ArrayList<>();
	static double toplamOdenecekFiyat=0;
	
	

	public static void main(String[] args) {
		
		urunIsimleri.add("Domates-0");
		urunIsimleri.add("Patlican-1");
		urunIsimleri.add("Karpuz-2");
		urunIsimleri.add("Biber-3");
		urunIsimleri.add("Erik-4");
		urunIsimleri.add("Armut-5");
	
		urunFiyatlari.add(4.5);
		urunFiyatlari.add(5.40);
		urunFiyatlari.add(1.25);
		urunFiyatlari.add(1.75);
		urunFiyatlari.add(6.56);
		urunFiyatlari.add(3.78);
		urunSec();
		
             
	}
	public static void urunSec() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Asagidaki listeden  sectiginiz urunun \n " + "Urunun kodunu ve kac kilo almak istediginizi giriniz\n"+urunIsimleri);
		
		int urunKodu=scan.nextInt();
		double kilo=scan.nextDouble();
	    
		double toplamUrunFiyati=urunFiyatlari.get(urunKodu)*kilo;
	 
		toplamOdenecekFiyat+=toplamUrunFiyati;
	    System.out.println("Alisverise devam etmek ister misiniz? E/H");
		char karar=scan.next().toUpperCase().charAt(0);
		if(karar=='H') {
			System.out.println("Bizi tercih ettiginiz icin tesekuler.\n"+ "Odemeniz gereken tutar :"+toplamOdenecekFiyat);
		}else if(karar=='E') {
			urunSec();
		}else {
			System.out.println("Yanlis tusa bastiniz.");
		}
		
	}

}
