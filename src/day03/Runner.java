package day03;

import java.util.Arrays;

public class Runner {

	
	
	public static void main(String[] args) {
		
		Ogretmen ogretmen1=new Ogretmen(40," Ali Can ",13500, false, " Erkek "," Fen ", " Oxford ");
		Ogretmen ogretmen2=new Ogretmen(35," Ayse Can ",12000, true, " Kadin "," Bilgisayar ", " MIT ");
		Ogretmen ogretmen3=new Ogretmen(30," Zeynep Can ",10000, false, " Kadin "," Matematik ", " Stanford ");
	
	    String isimSoyisim[]=new String[3];
	    isimSoyisim[0]=ogretmen1.isim;
	    isimSoyisim[1]=ogretmen2.isim;
	    isimSoyisim[2]=ogretmen3.isim;
	System.out.println(Arrays.toString(isimSoyisim));
	 String brans[]=new String[3];
	    brans[0]=ogretmen1.brans;
	    brans[1]=ogretmen2.brans;
	    brans[2]=ogretmen3.brans;
	System.out.println(Arrays.toString(brans));
	boolean isMarried[]=new boolean[3];
	isMarried[0]=ogretmen1.isMarried;
	isMarried[1]=ogretmen1.isMarried;
	isMarried[2]=ogretmen1.isMarried;
	
	for (int i = 0; i <isMarried.length; i++) {
		System.out.println(i+1 + ". ogretmenin bilgileri:"+isimSoyisim[i]+ " "+ brans[i] + " "+ isMarried[i]);
	}
	
	
	}
		
		
		
	}

