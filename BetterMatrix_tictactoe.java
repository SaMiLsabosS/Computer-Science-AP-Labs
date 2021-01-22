import static java.lang.System.*;
/*
 * Programmer: Sami Melhem
 * Date: 1/21/21
 * Purpose: 2D Arrays
*/
public class BetterMatrix_tictactoe{
    public static void main(){
       String[][] values={{"XXXOOXXOO"},{"OXOOXOXOX"},{"OXOXXOXOO"},{"OXXOXOXOO"},{"XOXOOOXXO"}};
       for(int row=0;row<values.length;row++)     
         getAndPrintMatrix(values[row][0]);
    }
    public static void getAndPrintMatrix(String pattern){
       String[][] matrix=new String[3][3];
       int wordPosition=0;
       for(int row=0;row<matrix.length;row++){//create and print matrix
         for(int col=0;col<matrix[0].length;col++){
            matrix[row][col]=pattern.substring(wordPosition,wordPosition+1); 
            out.print(matrix[row][col]+" "); 
            wordPosition++;
         } 
         out.println();
       }
       determineWinner(matrix); //check matrix for winner or no winner
    }
    public static void determineWinner(String[][] matrix){
       int countX=0; 
       int countO=0;
       boolean winner=false;
       //horizontal method
       for(int row=0;row<matrix.length;row++){ 
         for(int col=0;col<matrix[0].length;col++){
           if(matrix[row][col].equals("X"))
             countX++;           
           else 
             countO++;
         }
         if(countX==3){
           out.println("X wins horizontally!");
           winner=true;
           countX=0;
         }
         else if(countO==3){
           out.println("O wins horizontally!");
           winner=true;
           countO=0;
         }
         countX=0;
         countO=0;
       }
       countX=0; 
       countO=0;
       //vertical method
       for(int col=0;col<matrix[0].length;col++){ 
         for(int row=0;row<matrix.length;row++){
           if(matrix[row][col].equals("X"))
             countX++;
           else
             countO++;
         }
         if(countX==3){
           out.println("X wins vertically!");
           winner=true;
           countX=0;
         }
         else if(countO==3){
           out.println("O wins vertically!");
           winner=true;
           countO=0;
         }
         countX=0;
         countO=0;
       }
       countX=0; 
       countO=0;
       //diagonal method
       int countXBack=0;
       int countOBack=0;
       int row=0;
       int back=matrix[0].length-1; 
       for(int rowCol=0;rowCol<matrix.length;rowCol++){ 
           if(matrix[rowCol][rowCol].equals("X")) //back slash
             countX++;
           else
             countO++;
           if(matrix[row][back].equals("X")) //forward slash
             countXBack++;
           else
             countOBack++;
           row++;
           back--;
       }
       if(countX==3 || countXBack==3){
           out.println("X wins diagonally!");
           winner=true;
       }
       else if(countO==3 || countOBack==3){
           out.println("O wins diagonally!");  
           winner=true;
       }
       if(!winner) // no winner method
         out.println("cat's game - no winner!");
       out.println("\n");
    }
}