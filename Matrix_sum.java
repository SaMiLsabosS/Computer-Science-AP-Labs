import static java.lang.System.*;
/*
 * Programmer: Sami Melhem
 * Date: 1/21/21
 * Purpose: 2D Arrays
*/
public class Matrix_sum{
   public static void main(){
       out.println("Matrix Values:");
       int[][] matrix={{1,2,3,4,5},{6,7,8,9,0},{6,7,1,2,5},{6,7,8,9,0},{5,4,3,2,1}};
       for(int row=0;row<matrix.length;row++){ //prints matrix
          for(int col=0;col<matrix[0].length;col++)
             out.print(matrix[row][col]+"  ");
          out.println();
       }
       out.println();
       out.println("The sum of 2,2 is "+matrixSumming(2,2,matrix)+".");
       out.println("The sum of 0,0 is "+matrixSumming(0,0,matrix)+".");
       out.println("The sum of 4,3 is "+matrixSumming(4,3,matrix)+".");
       out.println("The sum of 4,4 is "+matrixSumming(4,4,matrix)+".");
       out.println("The sum of 2,4 is "+matrixSumming(2,4,matrix)+".");
       out.println("The sum of 1,3 is "+matrixSumming(1,3,matrix)+".");
   }
   public static int matrixSumming(int row,int col,int[][] matrix){
      int sum=matrix[row][col];//creates sum and adds point                  
      if(col-1!=-1) 
        sum+=matrix[row][col-1]; //left
      if(col+1!=matrix[row].length) 
        sum+=matrix[row][col+1]; //right
      if(row-1!=-1){ //collecting three values above
        sum+=matrix[row-1][col]; //up
        if(col-1!=-1)
          sum+=matrix[row-1][col-1]; //up left diag.
        if(col+1!=matrix[row].length)
          sum+=matrix[row-1][col+1]; //up right diag.
      }
      if(row+1!=matrix.length){ //collecting three values below
        sum+=matrix[row+1][col]; //down
        if(col-1!=-1)
          sum+=matrix[row+1][col-1]; //down left diag.
        if(col+1!=matrix[row].length)
          sum+=matrix[row+1][col+1]; //down right diag.
      }    
      return sum;
   }
}