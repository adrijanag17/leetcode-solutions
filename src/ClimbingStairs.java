public class ClimbingStairs {

    // using iterative method and dynamic programming
    public static int climbStairs(int n){
        int [] steps = new int[n+1];
        if (n == 0 || n == 1 || n == 2){
            return n;
        }
        steps[0] = 0;
        steps[1] = 1;
        steps[2] = 2;

        for (int i  = 3; i <= n; i++){
            // array stores previous values - dynamic programming
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }       // T: O(n) S: O(n)

    // using recursion and dynamic programming
    public static int climbStairs2(int n){
        if (n == 0 || n == 1 || n == 2){
            return n;
        }
        int [] steps = new int[n+1];
        steps[n-1] = climbStairs2(n-1);
        steps[n-2] = climbStairs2(n-2);
        return steps[n-1] + steps[n-2];
    }       // T: O(2^n) S: O(n)

    // using only recursion - not efficient
    public static int climbStairs3(int n){
        if (n == 0 || n == 1 || n == 2){
            return n;
        }
        return climbStairs3(n-1) + climbStairs3(n-2);
    }       // T: O(2^n) S: O(1)

    // optimized iterative approach (with dp)
    public static int climbStairs4(int n){
        if (n == 1 || n == 2){
            return n;
        }
        int allWays = 0;
        int oneStepPriorWays = 2;
        int twoStepPriorWays = 1;

        for (int i = 3; i <=n; i++){
            allWays = oneStepPriorWays + twoStepPriorWays;
            twoStepPriorWays = oneStepPriorWays;
            oneStepPriorWays = allWays;
        }
        return allWays;
    }       // T: O(n) S: O(1)

    public static void main(String[] args){
        System.out.println(climbStairs4(0));
        System.out.println(climbStairs4(1));
        System.out.println(climbStairs4(2));
        System.out.println(climbStairs4(3));
        System.out.println(climbStairs4(4));
        System.out.println(climbStairs4(5));
        System.out.println(climbStairs4(6));
    }
}
