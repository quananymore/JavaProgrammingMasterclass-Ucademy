public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        int result = num1 + num2;
        if(result==num3){
            return true;
        }
        else return false;
    }
}
