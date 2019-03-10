import java.util.Scanner;
public class HW1_Table {

    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a;                                              // Declaring Variable
    System.out.print("Enter n: ");                         // Ask user to Enter an integer
    a = in.nextDouble();                                   // a is the input
    double output;                                         
    System.out.println("+----------+-----+");
    System.out.printf("|         n|    %.0f|%n",a);
    System.out.println("+----------+-----+");
    output = Math.pow(a,2);
    System.out.printf("| n squared|   %.0f|%n",output);
    System.out.println("+----------+-----+");
    output = Math.pow(a,3);
    System.out.printf("|   n cubed|   %.0f|%n",output);
    System.out.println("+----------+-----+");
    output = Math.pow(a,4);
    System.out.printf("|       n^4|  %.0f|%n",output);
    System.out.println("+----------+-----+");
    
    
    }
    
}
