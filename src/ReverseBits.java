public class ReverseBits {

    public static int reverseBits(int n){

        if (n == 0) return 0;
        int reverse = 0;
        for (int i = 0; i < 32; i++){
            reverse <<= 1;
            reverse += (n & 1);
            n >>>= 1;       // unsigned right shift
        }
        return reverse;
    }       // T: O(n) S: O(1)

    public static void main(String[] args) {
        System.out.println(reverseBits(-3));
    }
}
