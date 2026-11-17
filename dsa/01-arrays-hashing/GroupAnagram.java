// LC 49 - Group Anagrams | Pattern: HashMap of lists (sorted word as key) | Time O(n * k log k), Space O(n * k)
// Key trick: anagrams have the same sorted letters, so use the sorted word as the label for its group.

import java.util.*;

public class GroupAnagram {                                        // 1. class name = file name

    public static List<List<String>> groupAnagrams(String[] strs) {  // 2. added "static"
        Map<String, List<String>> boxes = new HashMap<>();

        for (String word : strs) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String label = new String(letters);

            if (!boxes.containsKey(label)) {
                boxes.put(label, new ArrayList<>());
            }
            boxes.get(label).add(word);
        }

        return new ArrayList<>(boxes.values());
    }

    public static void main(String[] args) {                         // 3. added main with tests
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        // [[eat, tea, ate], [tan, nat], [bat]] (group order may vary)

        System.out.println(groupAnagrams(new String[]{""}));    // [[]]  edge case: empty string
        System.out.println(groupAnagrams(new String[]{"a"}));   // [[a]] edge case: one word
    }
}