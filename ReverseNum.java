import static java.lang.System.*;
public class ReverseNum{
    public static void main(String arqs[]){
        out.println("234 reversed is "+reverse(234));
        out.println("10000 reversed is "+reverse(10000));
        out.println("111 reversed is "+reverse(111));
        out.println("9005 reversed is "+reverse(9005));
        out.println("84645 reversed is "+reverse(84645));
        out.println("8547 reversed is "+reverse(8547));
        out.println("123456789 reversed is "+reverse(123456789));
    }
    public static int reverse(int num){
        int answer = 0;
        while(num>0){
            answer = (answer*10) + (num%10);
            num = num/10;
        }
        return answer;
    }
}
