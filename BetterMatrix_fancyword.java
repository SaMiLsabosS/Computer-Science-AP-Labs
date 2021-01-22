import static java.lang.System.*;
/*
 * Programmer: Sami Melhem
 * Date: 1/21/21
 * Purpose: 2D Arrays
*/
public class BetterMatrix_fancyword{
    public static void main(){
       String fancyWord="HELLO";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
       fancyWord="CAT";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
       fancyWord="A";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
       fancyWord="DOGHOUSE";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
       fancyWord="ONE";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
       fancyWord="IT";
       printMatrix(wordMatrix(fancyWord,fancyWord.length()));
    }
    public static void printMatrix(String[][] matrix){ //prints the matrix
       for(int row=0;row<matrix.length;row++){
         for(int col=0;col<matrix[0].length;col++)
            out.print(matrix[row][col]); 
         out.println();
       }
       out.println("\n\n");
    }
    public static String[] lineWithSpace(int numCol1,int numCol2,String col1,String col2,int length){ //Creates a line with spaces and two letters
        String[] line=new String[length];
        for(int i=0;i<line.length;i++)
          if(i!=numCol1 && i!=numCol2)
            line[i]=" ";          
          else if(i==numCol1)
            line[i]=col1;          
          else
            line[i]=col2;                  
        return line;
    }
    public static String[][] wordMatrix(String word,int length){
       String[][] mat=new String[length][length];
       for(int i=0;i<word.length();i++){ //adds first and last line of the 2D Array
         mat[0][i]=word.substring(i,i+1);
         mat[mat.length-1][i]=word.substring(i,i+1);
       }
       if(length<=2) //2 or less exception
         return mat; 
       if(word.length()%2!=0){ //Odds
         int back=word.length()-2;
         for(int i=1;i<word.length()/2;i++){ //Everything outside the middle
           mat[i]=lineWithSpace(i,back,word.substring(i,i+1),word.substring(back,back+1),length);
           mat[word.length()-1-i]=lineWithSpace(i,back,word.substring(i,i+1),word.substring(back,back+1),length);
           back--;
         }
         //Middle
         String[] line=new String[length]; //lineWithSpace but with one letter
         for(int i=0;i<line.length;i++){
           if(i!=word.length()/2)
             line[i]=" ";         
           else
             line[i]=word.substring(word.length()/2,word.length()/2+1);          
         }   
         mat[word.length()/2]=line;
       }
       else{ //Evens
         int back=word.length()-2;
         for(int i=1;i<word.length()/2-1;i++){ //Everything outside the middle 
            mat[i]=lineWithSpace(i,back,word.substring(i,i+1),word.substring(back,back+1),length);
            mat[word.length()-1-i]=lineWithSpace(i,back,word.substring(i,i+1),word.substring(back,back+1),length);
            back--;
         }         
         //Middle
         mat[word.length()/2-1]=lineWithSpace(word.length()/2-1,word.length()/2,word.substring(word.length()/2-1,word.length()/2),word.substring(word.length()/2,word.length()/2+1),length);
         mat[word.length()/2]=lineWithSpace(word.length()/2-1,word.length()/2,word.substring(word.length()/2-1,word.length()/2),word.substring(word.length()/2,word.length()/2+1),length);
       }
       return mat;
    }
}