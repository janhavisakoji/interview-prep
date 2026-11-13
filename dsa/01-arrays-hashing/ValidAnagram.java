// LC 242 - Valid Anagram | Pattern: Frequency count (int[26]) | Time O(n), Space O(1)
// Key trick: +1 for each letter in s, -1 for each letter in t; all zeros = anagram.

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));  // true
        System.out.println(isAnagram("rat", "car"));          // false
        System.out.println(isAnagram("ab", "abc"));           // false (different lengths)
    }
}