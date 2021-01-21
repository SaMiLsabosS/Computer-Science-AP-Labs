import static java.lang.System.*;
public class stringBasics{
    public static void main(String arqs[]){
       String one = "hello world";
       String two = "jim bob";
       String three = "sally sue";
       String four = "computer science";
       String five = "uil contests";
       out.println(print(one)+print(two)+print(three)+print(four)+print(five));
    }    
    public static String print(String input){
        return "first :: "+firstWord(input)+"\n"+"last :: "+secondWord(input)+"\n"+
        "sum :: "+input+"\n\n";
    }    
    public static String firstWord(String input){
        int space = input.indexOf(" ");
        return input.substring(0,space);
    }    
    public static String secondWord(String input){
        int space = input.indexOf(" ");
        return input.substring(space,input.length());
    } 
}