import java.util.Scanner;
public class Calculator {

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double a;
      System.out.print("Enter the first number: ");
      a = in.nextDouble();
      double b;
      System.out.print("Enter the second number: ");
      b = in.nextDouble();
      double x;
      x = a*b;
      System.out.printf("%.0f *    %.0f =    %.0f %n",a,b,x);
      double y;
      y = a/b;
      System.out.printf("%.0f /    %.0f =    %.0f %n",a,b,y);
      double z;
      z = a % b;
      System.out.printf("%.0f %%    %.0f =    %.0f %n%n",a,b,z);
      double c;
      c = b*a;
      System.out.printf("%.0f *    %.0f =    %.0f %n",b,a,c);
      double d;
      d = b/a;
      System.out.printf("%.0f /    %.0f =    %.0f %n",b,a,d);
      double e;
      e = b % a;
      System.out.printf("%.0f %%    %.0f =    %.0f %n",b,a,e);
      
    
 }
}
