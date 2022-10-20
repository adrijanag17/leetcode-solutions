import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        //brute force method
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    } //T: O(n^2) S: O(1)

    public static int[] twoSum2(int[] nums, int target){
        // using a hash map and two passes
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            //to check if complement present in map and complement is not the same element as nums[i]
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{-1,-1};
    }   // T: O(n) S: O(n)

    public static int[] twoSum3(int[] nums, int target){
        // using hash map and only one pass
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1} ;
    }   // T:O() S: O(n)

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 4;
        int[] indices = twoSum3(nums, target);
        for (int index: indices){
            System.out.println(index);
        }
    }
}
