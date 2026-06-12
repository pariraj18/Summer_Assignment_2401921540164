class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i, right = i;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
        

