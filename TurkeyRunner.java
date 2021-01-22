import java.util.*;
import static java.lang.System.*;
public class TurkeyRunner
{
    public static void main(){
        Scanner k=new Scanner(System.in);
        TurkeyFarm farm = new TurkeyFarm();
        boolean stop=true;
        while(stop){
          out.println("This is the Blazing Pitchfork's Farm!\nenter 1 to add a turkey\nenter 2 to remove a turkey\nenter 3 to update weight\nenter 4 to print the list of turkeys\nenter 5 to end\n");
          boolean num=true;
          while(num){
            out.print("entry: ");
            int entry=k.nextInt();
            boolean name=true;
            boolean change=false;
            if(entry==1){
              while(name){
                out.print("Enter turkey name: ");
                String turkeyName=k.next();               
                for(int i=0;i<farm.getTurkeys();i++)
                  if(farm.getTurkey(i).getName().equals(turkeyName) && farm.getTurkey(i).getOunces()==1){change=true;}                  
                if(change){
                  out.println("\nPlease name your turkey a different name!\n");  
                  change=false;}
                else{
                  farm.addTurkey(turkeyName);
                  out.println(farm);
                  num=false;
                  name=false;}}}                         
            else if(entry==2){
              out.println(farm);
              out.print("Which number turkey would you like to kill? ");
              farm.removeTurkey(k.nextInt());  
              out.println(farm); 
              num=false;}
            else if(entry==3){
              out.println(farm); 
              out.print("Which number turkey would you like to adjust the weight of?: ");
              int turkey=k.nextInt();  
              out.print("What is "+farm.getTurkey(turkey).getName()+"'s new weight?: ");
              double adjustment=k.nextInt();
              farm.getTurkey(turkey).setOunces(adjustment);
              out.println(farm);
              num=false;}
            else if(entry==4){
              out.println(farm); 
              num=false;}
            else if(entry==5){
              num=false;
              stop=false;
              out.println("You have blown up the farm!");}
            else{
              out.println("\nEnter a number from 1-5, not anything else!\n");
              out.println("Welcome to Blazing Pitchfork's Farm!\nenter 1 to add a turkey\nenter 2 to remove a turkey\nenter 3 to update weight\nenter 4 to print the list of turkeys\nenter 5 to end\n");}}}}}