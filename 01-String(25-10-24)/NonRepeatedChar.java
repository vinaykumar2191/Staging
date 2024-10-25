package staging_area;

import java.util.Scanner;

public class NonRepeatedChar {

	public static char firstNonRepeatedChar(String s) {
		
		 for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            boolean flag = true; 
	           
	            for (int j = i+1; j < s.length(); j++) {
	                if (ch == s.charAt(j)) {
	                    flag = false; 
	                    break; 
	                }
	            }
	            
	            if (flag) {
	                return ch;
	            }
	        }
	        
	        return '0';
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : "); //swiss
		String input = sc.nextLine();
		char result = firstNonRepeatedChar(input);
		System.out.println(result);
	}
}
