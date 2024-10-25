package staging_area;

import java.util.Scanner;

public class LongestSubStr {

	public static int lenOfSubStr(String s) {
		int len = 0;
		String subStr = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(subStr.indexOf(ch) != -1) {
				while(subStr.indexOf(ch) != -1) {
					subStr = subStr.substring(1);
				}
			}
			
			subStr += ch;
			len = Math.max(len, subStr.length());
		}
		return len;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : "); //abcabcbb
		String input = sc.nextLine();
		int result = lenOfSubStr(input);
		System.out.println(result);
	}

}
