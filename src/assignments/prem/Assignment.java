// write reusable program to revere a string without changing special characters position
	// ex: String str = "he@l#&l%o"  -> o@l#&le%h
package assignments.prem;
public class Assignment_one {
	public static void main(String[] args) {
	public static String reverseStringSpecialChar((String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String input = "he@l#&l%o";
        String result = reverseStringSpecialChar(input);
        System.out.println(result); 
    }
}

}
