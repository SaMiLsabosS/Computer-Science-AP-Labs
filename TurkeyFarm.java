import java.util.ArrayList;
public class TurkeyFarm{
   private static Turkey[] turkeys, newTurkeys, remove;
   private Turkey turkey;
   private String wrong, name;
   private int length;
   public TurkeyFarm(){
       turkeys = new Turkey[0]; 
       length=1;}
   public void addTurkey(String name){
       newTurkeys=new Turkey[length];
       for(int i=0;i<turkeys.length;i++)
          newTurkeys[i]=turkeys[i];       
       turkey=new Turkey(name,1);
       newTurkeys[length-1]=turkey;
       turkeys=newTurkeys;
       length++;}
   public void removeTurkey(int turkeyNum){
       length--;
       remove=new Turkey[length-1];
       for(int i=0;i<turkeys.length;i++)           
          if(i!=turkeyNum)
            remove[i]=turkeys[i];       
       turkeys=remove;}
   public Turkey getTurkey(int turkeyNum){return turkeys[turkeyNum];}
   public String toString(){
       String output="\n";
       for(int i=0;i<turkeys.length;i++)
          output+=i+" "+turkeys[i]+"\n";       
       return output;}
   public int getTurkeys(){return turkeys.length;}}