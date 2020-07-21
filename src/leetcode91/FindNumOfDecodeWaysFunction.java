package leetcode91;

public class FindNumOfDecodeWaysFunction {
	public int numDecodings(String s) {
		// Check error first
		if(s == null || s.length() == 0){
			return 0;
		}
		
		int[] dp = new int[s.length() + 1];
		
		// It is weird cause 0 length of string should be 0, but it will be 1 because we need dp[i - 2] later on
		dp[0] = 1;
		
		// we probably don't need the if statement since we already check if s.length is empty above
		dp[1] = s.charAt(0) == '0' ? 0 :1;
		
		// Starting from index = 2 because dp[0] and dp[1] already fill in
		for(int i = 2; i <= s.length(); i++){
			// Single digit, if its 0, it doesn't count as decode
			int oneDigit = Integer.valueOf(s.substring(i - 1, i));
			
			// double digit, if its over 26 or less than 10, it doesn't count as decode
			int twoDigit = Integer.valueOf(s.substring(i - 2, i));
			
			// since onedigit could only be in between 1-9
			if(oneDigit >= 1){
				dp[i] += dp[i - 1];
			}
			
			// can not pass 26 and under 10
			if(twoDigit >= 10 && twoDigit <= 26){
				dp[i] += dp[i - 2];
			}
		}
		
		return dp[s.length()];
	}
}
