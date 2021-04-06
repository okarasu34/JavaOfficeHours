package day02;

public class Bolunebilme {

	public static void main(String[] args) {
		/*1 den 100 e kadar olan sayilarin 3'e 5' e ve 15' e bolunebilen 
		 * sayilari yazdiralim 
		 */
		int sayi;
		for (int i = 1; i <=100; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i + " sayisi 15' e tam bolunebilir.");
			}else if(i%5==0) {
				System.out.println(i + " sayisi 5' e tam bolunebilir.");
			}else if(i%3==0) {
				System.out.println(i + "  sayisi 3' e tam bolunebilir.");
			}else {
				System.out.println("Kalan sayilar bolunemiyor");
				
			}
			
		}

	}

}
