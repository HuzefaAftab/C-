import java.util.Scanner;
public class Abs {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double a;
       System.out.print("Enter a: ");
       a = in.nextDouble();
       double b;
       System.out.print("Enter b: ");
       b = in.nextDouble();
       double diff;
       diff = (a - b);
   
       if (a < b) {
           System.out.printf("%.2f - %.2f = %.2f %n%n", b , a, -diff);
           
       }
       else 
           System.out.printf("%.2f - %.2f = %.2f %n%n",a,b, diff);
       
    }
    
}
