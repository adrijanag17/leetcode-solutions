public class ProdOfArrayExceptSelf {

    // must solve in O(n) and without using division (dividing total product by current number)
    // should not use extra space other than the new array
    // logic:           [1          2       3       4]
    // left prod:       [1          1       2*1    3*2*1]
    // right prod:      [2*3*4     3*4      4        1]
    public static int[] productExceptSelf(int[] nums){

        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++){
            answer[i] = nums[i-1] * answer[i-1];
        }
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--){
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }       // T: O(n) S: O(1) - not counting the answer array

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = productExceptSelf(nums);
        for (int i : ans){
            System.out.println(i);
        }
    }
}
