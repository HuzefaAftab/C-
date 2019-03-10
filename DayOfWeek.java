import java.util.Scanner;

public class DayOfWeek {

   
    public static void main(String[] args) {
     printDay();
     printDay();
     printDay();
     printDay();
    System.out.printf("Bye%n");   
    }
    public static void printDay(){
        Scanner kb = new Scanner(System.in);
        double a;
        System.out.print("Enter the day(1-7): ");
        a = kb.nextDouble();
        if (1 == a){
            System.out.printf("%.0f -  Monday%n",a);
        }
        else if (2 == a){
        System.out.printf("%.0f -  Tuesday%n",a);
    }
        else if (3 == a){
            System.out.printf("%.0f - Wednesday%n",a);
        }
        else if (4 == a){
            System.out.printf("%.0f -  Thursday%n",a);
        }
        else if (5 == a){
            System.out.printf("%.0f - Friday%n",a);
        }
        else if (6 == a){
            System.out.printf("%.0f - Saturday%n",a);
        }
        else if (7 == a){
            System.out.printf("%.0f - Sunday%n",a);
        }
        else if (a < 1){
        System.out.printf("Invalid%n");
    }
        else if (a > 7){
        System.out.printf("Invalid%n");
    }
         
    }
      
}
