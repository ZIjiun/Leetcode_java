public class Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0, sum = 0;
        while( i >= 0 || j >= 0) {
            if (i >= 0) sum = sum + (a.charAt(i--) - '0');
            if (j >= 0) sum = sum + (b.charAt(j--) - '0');
            carry = sum / 2;
            sum = sum % 2;
            sb.append(sum);
            sum = carry;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
