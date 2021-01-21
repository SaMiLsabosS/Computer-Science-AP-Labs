import java.util.Scanner;
import static java.lang.System.*;
public class Lab1
{
    public static void main(String[] arqs)
    {
      //Put the scanner into the program
      Scanner kb = new Scanner(System.in);
      
      //print the statement and create 2 int variables
      out.print("please enter two integers: ");
      int oneint = kb.nextInt(); // 4
      int twoint = kb.nextInt(); // 5
      //print out the statement and add both int variables
      out.println("the sum is: "+ (oneint + twoint)); // (4 + 5)
      
      //print the statement and create 2 double variables
      out.print("please enter two real numbers: ");
      double onereal = kb.nextDouble(); // 2.2
      double tworeal = kb.nextDouble(); // 3.3
      //print out the statement and add both double variables
      out.println("the sum is: "+ (onereal + tworeal)); // (2.2 + 3.3)
      
      //print the statement and create 5 string variables 
      out.println("please enter 5 words on the same line: ");
      String oneword = kb.next(); // i
      String twoword = kb.next(); // love
      String threeword = kb.next(); // fridays
      String fourword = kb.next(); // for
      String fiveword = kb.next(); // myself
      out.println(oneword+"\n"+twoword+"\n"+threeword+"\n"+fourword+"\n"+fiveword);
      // i
      // love
      // fridays
      // for 
      // myself
    }
}
