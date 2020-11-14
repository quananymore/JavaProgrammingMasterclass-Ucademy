public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int lastDigit=number%10;
        int firstDigit=number-lastDigit;
        while (firstDigit>=10){
            firstDigit/=10;
        }
        if (number<10){
            return number*2;
        }
        return lastDigit+firstDigit;
    }
}