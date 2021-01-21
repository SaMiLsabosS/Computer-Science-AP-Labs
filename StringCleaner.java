import static java.lang.System.*;
public class StringCleaner{
    public static void main(String arqs[]){
        out.println(cleaner("xR-MxR-MHelloxR-M","R-M"));
        out.println(cleaner("sxsssxssxsxssexssxsesss","xs")); 
        out.println(cleaner("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty"));
    }
    public static String cleaner(String gibberish, String remove){
        String answer = gibberish;
        int num2 = remove.length();
        int character = 0;
        while(answer.indexOf(remove)>=0){
            character = answer.indexOf(remove)-1;
            answer = (answer.substring(0,character) + answer.substring(num2+character+1));
        }
        return gibberish+" - "+"String to remove "+remove+"\n"+answer+"\n\n";
    }
}
