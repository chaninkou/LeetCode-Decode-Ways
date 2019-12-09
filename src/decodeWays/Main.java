package decodeWays;

public class Main {
	public static void main(String[] args) {
		String s = "226";
		
		System.out.println("Input: " + s);
		
		FindNumOfDecodeWaysFunction solution = new FindNumOfDecodeWaysFunction();
		
		System.out.println("Solution: " + solution.numDecodings(s));
		
	}
}
