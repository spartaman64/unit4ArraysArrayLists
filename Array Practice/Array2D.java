

/**
 * Write a description of class Array2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2D
{
   private int[][] table = 
    {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
    };
   
   public Array2D()
   {
       
    }
    
   public String toString()
   {
       String str = "";
       for( int row = 0; row < table.length; row++)
       {
           for (int col = 0; col < table[row].length; col++)
           {
               str += table[row][col] + "\t";
            }
           str += "\n";
        }
        
       return str;
    }
   
   public String getRow(int row)
   {
       String str = "";
       for(int col = 0; col < table[row].length; col++)
       {
           str += table[row-1][col]+"\t";
        }
        
       return str;                                                                                                                                     
    }
    
   public String getCol(int col)
   {
       String str = "";
       for(int row = 0;row < table.length;row++)
       {
           str += table[row][col-1]+"\t";
        }
       
       return str;
    }
   
   

   public static void main(String[] args)
   {
       Array2D table = new Array2D();
       
       System.out.println(table.getRow(2)+" is the row");
       System.out.println(table.getCol(2)+" is the column");
       System.out.println(table.toString());
    }
}
