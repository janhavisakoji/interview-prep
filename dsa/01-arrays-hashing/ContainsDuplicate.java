// LC 217 - Contains Duplicate | Pattern: HashSet | Time O(n), Space O(n)
// Key trick: check if seen before, then remember it. Return true on first repeat.

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (seen.contains(x)) {
                return true;
            }
            seen.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));     // expected: true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));     // expected: false
        System.out.println(containsDuplicate(new int[]{1}));              // expected: false (edge case)
    }
}