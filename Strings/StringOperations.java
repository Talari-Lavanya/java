package Strings;

public class StringOperations {

    // Custom equalsIgnoreCase method
    public boolean equalsIgnoreCase(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Convert both characters to lowercase and compare
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
        }
        return true;
    }

    // Custom startsWith method
    public boolean startsWith(String str, String prefix) {
        if (str == null || prefix == null) return false;
        if (prefix.length() > str.length()) return false;

        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Custom endsWith method
    public boolean endsWith(String str, String suffix) {
        if (str == null || suffix == null) return false;
        if (suffix.length() > str.length()) return false;

        int start = str.length() - suffix.length();
        for (int i = 0; i < suffix.length(); i++) {
            if (str.charAt(start + i) != suffix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Custom compareTo method
    public int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null) return (str1 == null) ? -1 : 1;

        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;  // Compare the difference in ASCII values
            }
        }

        // If all characters are the same, compare based on length
        return len1 - len2;
    }

    public static void main(String[] args) {
        StringOperations operations = new StringOperations();

        // Test equalsIgnoreCase
        System.out.println(operations.equalsIgnoreCase("hello", "HELLO"));  // true

        // Test startsWith
        System.out.println(operations.startsWith("hello", "he"));  // true

        // Test endsWith
        System.out.println(operations.endsWith("hello", "lo"));  // true

        // Test compareTo
        System.out.println(operations.compareTo("apple", "banana"));  // negative value
        System.out.println(operations.compareTo("apple", "apple"));  // 0
        System.out.println(operations.compareTo("banana", "apple"));  // positive value
    }
}
