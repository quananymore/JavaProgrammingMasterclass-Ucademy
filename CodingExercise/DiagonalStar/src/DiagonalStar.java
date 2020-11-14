public class DiagonalStar {
    // write your code here
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");

        }
        int n=number;
        while (number>=5) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i == n - j - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            break;
        }
    }
}