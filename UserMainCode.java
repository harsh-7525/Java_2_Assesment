package Assesment2;
import java.util.Scanner;

public class UserMainCode {
	
	public static void solve(String password) {
		 int d = 0;
		    if (password.length() >= 8) {
		      if (password.contains("#") || password.contains("@") || password.contains("_")) {
		        char c = password.charAt(0);
		       
		        if (Character.isAlphabetic(c)) {
		          char dd = password.charAt(password.length() - 1);
		          
		          if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))

		          {
		            if (password.matches(".*[0-9]{1,}.*")
		                || password.matches(".*[a-zA-Z]{1,}.*")) {

		              System.out.println("Valid");

		            } else{
		              System.out.println("Invalid");
		            }
		          } else{
		            System.out.println("Invalid");
		          }
		        }
		         else{
		            System.out.println("Invalid");
		          }
		      } else{
		        System.out.println("Invalid");
		      }

		    } else{
		      System.out.println("Invalid");
		    }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String password = sc.next();
		    
		    solve(password);
		   
		  }

}
