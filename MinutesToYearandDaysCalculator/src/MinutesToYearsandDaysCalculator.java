public class MinutesToYearsandDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long days = (int) minutes / 1440;
            long remainMinutes = minutes % 1440;
            long years = (int) days / 365;
            long remaindays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remaindays + " d");
        }
    }
}
