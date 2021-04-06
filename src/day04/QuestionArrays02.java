package day04;

public class QuestionArrays02 {

	public static void main(String[] args) {
		
             int array[]= {1,2,3,4,5,6,20};
             System.out.println(ortalamaBul(array));
	}
          public static double ortalamaBul(int array[]) {
        	double ortalama=0;
        	double toplam=0;
        	
        	for (int each : array) {
				toplam+=each;
				
			}
        	  
        	  ortalama=toplam/array.length;
        	  
        	  return ortalama;
          }
	
	
	
	
	
}
