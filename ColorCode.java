package Assesment2;

import java.util.*;

public class ColorCode {

	  public static int validateColorCode(String s1) {
	        int b = -1, b1 = -1;
	        String s2 = s1.substring(1, s1.length());
	        if (s1.length() == 7)
	            if (s1.charAt(0) == '#')
	            b1 = 1;
	        if (b1 == 1)
	            for (int i = 0; i < s2.length(); i++) {
	            char c = s2.charAt(i);
	            if (c != '#') {
	                if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
	                    b = 1;
	                else {
	                    b = -1;
	                    break;
	                }
	            }
	        }
	        return b;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        String code = sc.next();
	         
	        if (validateColorCode(code) == 1)
	            System.out.println("Valid");
	        else
	            System.out.println("Invalid");

	}

}
