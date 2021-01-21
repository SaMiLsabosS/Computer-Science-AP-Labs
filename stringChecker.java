import static java.lang.System.*;
public class stringChecker{
    public static void main(String arqs[]){
        String one = "chicken";
        String two = "alligator";
        String three = "COMPUTER SCIENCE IS THE BEST!";
        String searchWord = "c";
        out.println("looking for c "+lookingFor(one, searchWord));
        searchWord = "ch";
        out.println("looking for ch "+lookingFor(one, searchWord));
        searchWord = "x";
        out.println("looking for x "+lookingFor(one, searchWord));
        searchWord = "g";
        out.println(one+"\n\n");
        out.println("looking for g "+lookingFor(two, searchWord));
        searchWord = "all";
        out.println("looking for all "+lookingFor(two, searchWord));
        searchWord = "gater";
        out.println("looking for gater "+lookingFor(two, searchWord));
        searchWord = "U";
        out.println(two+"\n\n");
        out.println("looking for U "+lookingFor(three, searchWord));
        searchWord = "COMP SCI";
        out.println("looking for COMP SCI "+lookingFor(three, searchWord));
        searchWord = "SCIENCE";
        out.println("looking for SCIENCE "+lookingFor(three, searchWord));
        out.println(three);
    }
    
    public static boolean lookingFor(String word, String searchWord){
      if(word.indexOf(searchWord)!=-1){
          return true;
      }
      return false;
    }
}
