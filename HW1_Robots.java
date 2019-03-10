import java.util.Scanner;
public class HW1_Robots {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         double x;
         System.out.print("Enter the current year:  ");
         x =  in.nextDouble();
         double y;
         System.out.print("Enter the year when robots take over the World: ");
         y = in.nextDouble();
         double z;
         System.out.print("Enter your birthday year: ");
         z = in.nextDouble();
         double a;
         a = (Math.abs(x-y));
         System.out.printf("You have %.0f years until they take over. %n", a);
         double b;
         b = (x-z);
         System.out.printf("After %.0f years, you have finally found the best thing in life: Computer Science. %n", b);
        
    }
    
}
