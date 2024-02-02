import java.util.*;

class PatternProgram {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the number of rows ");
        int rows = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
