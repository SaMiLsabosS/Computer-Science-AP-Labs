import static java.lang.System.*;
/*
 * Programmer: Sami Melhem
 * Date: 1/21/21
 * Purpose: 2D Arrays
*/
public class Matrix_count{
    public static void main(){
       String random="abc79x2";
       String[][] matrix=new String[20][20];       
       for(int row=0;row<matrix.length;row++){ //creates and prints matrix
          for(int col=0;col<matrix[0].length;col++){
             int rand=(int)(Math.random()*7);
             matrix[row][col]=random.substring(rand,rand+1);
             out.print(matrix[row][col]+"  ");
          }
          out.println();
       }
       out.println();
       //debug code method
       int count=0;
       String biggestCount="";//biggest counted letter
       for(int i=0;i<random.length();i++){
         int val=getCount(matrix,random.substring(i,i+1)); //gets count of letter
         out.println(random.substring(i,i+1)+" count is "+val); //print count of letter
         if(val>count){ 
           count=val; //sets count to the biggest counted letter
           biggestCount=random.substring(i,i+1); //sets String to the biggest counted letter
         }
       }  
       out.println("\n"+biggestCount+" occurs the most.");
    }
    public static int getCount(String[][] matrix, String poss){ //counts the amount of letter in the matrix
       int count=0;
       for(int row=0;row<matrix.length;row++)
         for(int col=0;col<matrix[0].length;col++)
           if(matrix[row][col].equals(poss))
             count++; 
       return count;       
    }
}