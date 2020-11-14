public class LastDigitChecker {
    // write your code here
    public static boolean isValid(int value){
        if(value>=10&&value<=1000)
            return true;
        else
            return false;
    }
    public static boolean hasSameLastDigit(int a,int b,int c){
        if(!isValid(a)||!isValid(c)||!isValid(c)){
            return false;
        }
        int lasta = a%10;
        int lastb = b%10;
        int lastc = c%10;
        return lasta==lastb||lasta==lastc||lastb==lastc;
    }
}