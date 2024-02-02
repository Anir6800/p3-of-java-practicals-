import java.util.*;
class sorting{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter  the number  of person: ");
    int PersonArray =sc.nextInt();
    double person_Weight[]=new double[PersonArray];
    double person_Height[]=new double[PersonArray];

    for (int i=1;i<=PersonArray;i++)
    {
        System.out.println("enter the height of person "+i+":" );
        person_Height[i]=sc.nextDouble();
        System.out.println("enter the weight of person "+i+":" );
        person_Weight[i]=sc.nextDouble();
    }
    System.out.println("sorting persons which have weight more than 50 and height is  less then 170");
    for(int i =0;i<PersonArray;i++)
    {
        if(person_Weight[i]>50 && person_Height[i] <170 ){
            System.out.println("person :" + i);
        }
            
    }
    sc.close();
    }
}