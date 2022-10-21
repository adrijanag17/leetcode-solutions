import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // using a hashmap
    public static boolean containsDuplicate (int[] nums){

        if (nums == null || nums.length == 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
                return true;
            }
            map.put(num, 1);
        }
         return false;
    }       // T: O(n) S: O(n)

    // using a hashset
    public static boolean containsDuplicate2 (int[] nums){

        if (nums == null || nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 8, 1, 2, 0};
        int[] nums2 = {2, 4, 7, 8, 1, 0};
        System.out.println(containsDuplicate2(nums));
        System.out.println(containsDuplicate2(nums2));
    }
}
