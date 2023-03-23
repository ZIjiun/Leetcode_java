import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public int romanToInt(String s) {

        Map<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        int previousValue = 0;
        int sum = 0;
        int currentValue;

        for(int i = 0; i < s.length() ; i++){
            currentValue = table.get((s.charAt(i)));
            sum += currentValue;
            if ( i !=0 && previousValue < currentValue) {
                sum -= previousValue * 2;
            }
            previousValue = currentValue;
        }
        return sum;
    }
}
