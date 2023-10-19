
ROMAN NUMBER:

import java.util.*;
public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanNumber or = new RomanNumber();
		Scanner sc = new Scanner(System.in);
		String src = sc.nextLine();
		System.out.println(or.romanToDecimal(src));
	}
	int value(char s) {
		if(s =='I') {
			return 1;
		}
		if(s == 'V') {
			return 5;
		}
		if(s == 'X') {
			return 10;
		}
		if(s == 'L') {
			return 50;
		}
		if(s == 'C') {
			return 100;
		}
		if(s == 'D') {
			return 500;
		}
		if(s == 'M') {
			return 1000;
		}
		else {
			return -1;
		}
	}
		int romanToDecimal(String str) {
			int ssr = 0 ;
			for(int i=0;i<str.length();i++) {
				int s1 = value(str.charAt(i));
				if(i+1<str.length()) {
					int s2 = value(str.charAt(i+1));
				     if(s1>=s2) {
				    	 ssr = ssr+s1;
				     }
				     else {
				    	 ssr = ssr+s2-s1;
				    	 i++;
				     }
				}
				else {
					ssr = ssr+s1;
				}
			}
			return ssr;
		}
		
	

}

				
