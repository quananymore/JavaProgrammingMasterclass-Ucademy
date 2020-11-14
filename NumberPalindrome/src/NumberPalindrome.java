public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number<0){
            number=number*(-1);
        }
        int init = number;
        int reverse=0;

        while (number>0){
            int lastDigit = number%10;
            reverse=(reverse*10)+lastDigit;
            number/=10;
        }
        return init==reverse;
    }

}