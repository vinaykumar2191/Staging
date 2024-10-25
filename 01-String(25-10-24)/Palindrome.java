package staging_area;

import java.util.Scanner;

public class Palindrome {

	public static boolean isBoolean(String str) {
		String pali = str.toLowerCase().replaceAll("[^a-z]", "");
		System.out.println(pali);
		
		int leftInd = 0;
		int rightInd = pali.length()-1;
		
		while(leftInd<rightInd) {
			if(pali.charAt(leftInd) != pali.charAt(rightInd)) {
				return false;
			}
			leftInd++;
			rightInd--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the input String : ");
		String input = sc.nextLine();
		
		boolean result = isBoolean(input);
		System.out.println(result);
		sc.close();
	}

}
