package staging_area;

import java.util.Scanner;

public class StrCompression {

	
	public static String compressedStr(String s) {
		StringBuilder comStr = new StringBuilder();
		int count = 1;
		
		for(int i=0; i<s.length(); i++) {
			while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
				count++;
				i++;
			}
			
			comStr.append(s.charAt(i));
			comStr.append(count);
			count = 1;
		}
		
		return comStr.length()<s.length() ? comStr.toString() : s;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : "); //aabbbccaaaaa
		String input = sc.nextLine();
		String result = compressedStr(input);
		
		System.out.println(result);
	}
}
