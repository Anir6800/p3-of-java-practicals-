import java.util.*;
class box{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length, breadth and height of the box:");
        double l =sc.nextDouble();
        double b =sc.nextDouble();
        double h =sc.nextDouble();
    
        System.out.println("The volume of the box is : "+l*b*h);   
        sc.close();

    }
}