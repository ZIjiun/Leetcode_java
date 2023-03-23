public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        char arr2[] = arr[arr.length-1].toCharArray();
        return arr2.length;
    }
}
