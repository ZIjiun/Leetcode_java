public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";
        String temp = "";
        Boolean flag = true;
        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()){
                    if(strs[0].charAt(i) == strs[j].charAt(i)) {
                        temp = String.valueOf(strs[j].charAt(i));
                    } else {
                        flag = false;
                    }
                } else {
                    temp = "";
                    break;
                }
            }
            if (flag) {
                commonPrefix += temp;
            }
        }
        return commonPrefix;
    }
}
