package Assignment;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	private static int convertingRomanToInteger(String roman) {
		int number=0;
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		roman=roman.replace("IV","IIII");
		roman=roman.replace("IX","VIIII");
		roman=roman.replace("XL","XXXX");
		roman=roman.replace("XC","LXXXX");
		roman=roman.replace("CD","CCCC");
		roman=roman.replace("CM","DCCCC");
		for(int i=0;i<roman.length();i++) {
			number +=m.get(roman.charAt(i));
		}
		return number;
	}

	public static void main(String[] args) {
		String roman="DXCIIVVII";
		int result=convertingRomanToInteger(roman);
		System.out.println(result);

	}
}
