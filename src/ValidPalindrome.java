public class ValidPalindrome {

    // without creating a new string - using while loop
    public static boolean isPalindrome(String s){

        if (s.isEmpty()) return true;
        int head = 0;
        int tail = s.length() - 1;
        char headChar, tailChar;

        while (head < tail){
            headChar = s.charAt(head);
            tailChar = s.charAt(tail);

            if (!Character.isLetterOrDigit(headChar)){
                head++;
            } else if (!Character.isLetterOrDigit(tailChar)){  // else if used because after each updation of head
                tail--;     //  or tail the loop should start over so that the value of headChar and tailChar can be updated
            } else if (Character.toLowerCase(headChar)!= Character.toLowerCase(tailChar)){
                return false;
            } else {
                head++;
                tail--;
            }
        }
        return true;
    }       // T: O(n) S: O(1)

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
