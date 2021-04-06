package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionArrayList04 {

	
	
	public static void main(String[] args) {
		String arr[][]= {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		arrToList(arr);
		
		
		
		
	}
	    public static void arrToList(String[][]arr) {
	    	List<String>arrList=new ArrayList<>();
	    	for (int i = 0; i < arr.length; i++) {
	    		for (int j = 0; j < arr[i].length; j++) {
	    			arrList.add(arr[i][j]);
					
				}
				
			}
	    	System.out.println(arrList);
	    	Collections.sort(arrList);
	    	System.out.println(arrList);
	    }
	
	
}
