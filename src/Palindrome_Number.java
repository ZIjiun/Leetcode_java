public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        Boolean isPalindrome = true;
        for (int i=0; i <= num.length() / 2 ; i++) {
            if (num.charAt(i) != num.charAt(num.length()-1-i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
