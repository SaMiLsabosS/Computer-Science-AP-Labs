import static java.lang.System.*;
public class PerfectNum{
    public static void main(String arqs[]){
        out.println(perfectNum(496));
        out.println(perfectNum(45));
        out.println(perfectNum(6));
        out.println(perfectNum(14));
        out.println(perfectNum(8128));
        out.println(perfectNum(1245));
        out.println(perfectNum(33));
        out.println(perfectNum(28));
        out.println(perfectNum(27));
        out.println(perfectNum(33));
    }
    public static String perfectNum(int num){
        String answer = num+"";
        int divisorCheck = 0;
        int x = 1; 
        while(x < num){
            if(num%x==0)
             divisorCheck = divisorCheck + x;
            x++;
        }
        if(divisorCheck==num)
         answer = num+" is perfect";
        else
         answer = num+" is not perfect";
        return answer;
    }
}
