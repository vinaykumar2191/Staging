package staging_area;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] c1 = s1.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
		char[] c2 = s2.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,  c2);
		
	}
	
	public static void main(String[] args) {
		String one = "silent";
		String two = "listen";
		
		System.out.println(isAnagram(one, two));
	}
}
