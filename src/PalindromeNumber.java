public class PalindromeNumber {

    public static boolean isPalindrome(int x){
        // by converting x to string
        String number = Integer.toString(x);
        // using two iterators at two ends and going on til the middle
        int i = 0, j = number.length()-1;
        while (i < j){
            if(number.charAt(i) != number.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }       // T:O(n) S:O(1)

    public static boolean isPalindrome2(int x){
        //using divide and modulo operators - risk of integer overflow
        int reverse, num;
        reverse = 0;
        num = x;
        while (num > 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        if (reverse  == x){
            return true;
        }
        return false;
    }       // T:O(n) S:O(1)

    public static boolean isPalindrome3(int x){
        //using % and / operations but reversing only half the number

        //taking care of edge cases
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverse = 0;
        while(x > reverse){
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return x == reverse / 10 || x == reverse;
    }       // T:O(n) S:O(1)

    public static void main(String[] args) {
        System.out.println(isPalindrome3(121));
        System.out.println(isPalindrome3(-212));
        System.out.println(isPalindrome3(10));
    }
}
