package day01;

import java.util.Scanner;

public class Question05 {
	/*
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini aliniz. kullaniciya
	 * musteri karti olup olmadigini sorunuz Musteri karti varsa ve 10 urunden fazla
	 * alirsa %20,yoksa %15 karti yoksa ve 10 urunden fazla alirsa %15,yoksa %10
	 * indirim yapin
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aldiginiz urunun adedini giriniz");
		int quantity = scan.nextInt();
		System.out.println("Lutfen aldiginiz liste fiyatini giriniz");
		double price = scan.nextDouble();
		double totalPrice;
		System.out.println("Musteri kartiniz var mi? varsa Y yoksa N tusuna basiniz");
		char card = scan.next().charAt(0);
		if (card == 'y'||card == 'Y') {
			if (quantity > 10) {
				price *= 0.8;
			    totalPrice = price * quantity;
				System.out.println("%20 indirim kazandiniz ve toplam odeme miktari:" + totalPrice);

			} else {
				price *= 0.85;
				totalPrice = price * quantity;
				System.out.println("%15 indirim kazandiniz ve toplam odeme miktari:" + totalPrice);
			}
		} else if (card == 'n'||card == 'N') {
			if (quantity > 10) {
				price *= 0.85;
				totalPrice = price * quantity;
				System.out.println("%15 indirim kazandiniz ve toplam odeme miktari:" + totalPrice);

			} else {
				price *= 0.9;
				totalPrice = quantity * price;
				System.out.println("%10 indirim kazandiniz,toplam odeme miktari:" + totalPrice);
			}

		} else {
			System.out.println("Yanlis giris yaptiniz,lutfen tekrar deneyizniz.");
		}
		scan.close();
	}
	
}