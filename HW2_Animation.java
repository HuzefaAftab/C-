    import java.util.Scanner;

    public class HW2_Animation {
    public static void main(String[] args) {
          
        circle();
        circle();
        circle();    
    }
    public static void circle()
    {
       
        printPage("\n\n\n^\n");
        printPage("\n\n^\n\n");
        printPage("\n^\n\n\n");
        
        printPage(" >\n\n\n\n");
        printPage("  >\n\n\n\n");
        printPage("   >\n\n\n\n");
        
        printPage("\n    V\n\n\n");
        printPage("\n\n    V\n\n");
        printPage("\n\n\n    V\n");
       
        printPage("\n\n\n\n   <");
        printPage("\n\n\n\n  <");
        printPage("\n\n\n\n <");
     }
    public static void printPage(String drawing)
    {
        Scanner kb = new Scanner(System.in);
        String enter;
        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
        System.out.printf(drawing);
        System.out.println();
        enter = kb.nextLine();      
    }
    

    }
    

