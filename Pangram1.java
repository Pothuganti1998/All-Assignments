package Assignment;

public class Pangram1 {

	public static boolean  Pangram(String string) {
		Boolean isPangram=true;
		String string1=string.toLowerCase();
		for (char ch='a'; ch <='z'; ch++) {
			if(!string.contains(string.valueOf(ch))) {
				isPangram=false;
				break;
			}
		}
		if(isPangram) {
			return isPangram;
		}
		return isPangram;
	}
	public static void main(String[] args) {
		String s="nopqrstuvwxyh sslkd  sf swoifzgagbdcgddgegfggghigjgkdlm";
		System.out.println(Pangram(s));
	}
}
