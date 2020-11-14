import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        double sum = 0;
        int count=0;
        while (true){
            if (scanner.hasNextLong()){
                long num = (long)scanner.nextInt();
                sum+=num;
                count++;
            }
            else
                break;
            scanner.nextLine();
        }
        long avg = Math.round(sum/count);
        System.out.println("SUM = "+(int)sum+" AVG = "+avg);
    }

}