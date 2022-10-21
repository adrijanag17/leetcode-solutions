public class NumOfOneBits {

    // counting the last binary digit of number and shifting right
    public static int hammingWeight(int n){
        int count = 0;
        while (n != 0){     // java does not have unsigned ints
            count += n & 1;     //  n&1 gives us the last digit of binary representation
            n >>>= 1;        // shifts the number to the right by one place (unsigned shifting >>>)
        }
        return count;
    }       // T: O(n) S: O(1)

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
    }
}
