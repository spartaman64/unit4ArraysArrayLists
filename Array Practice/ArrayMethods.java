

/**
 * Write a description of class ArrayOperations2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
   private int[] values;
   
   public ArrayMethods(int[] initialValues)
   {
       values = initialValues;
    }
    
   public void swapFirstAndLast()
   {
       int temp = values[0];
       values[0] = values[values.length-1];
       values[values.length-1] = temp;
    }
    
   public void shiftRight()
   {
       int[] newArray;
       newArray = new int[values.length];
       
       newArray[0] = values[values.length-1];
       
       for(int i = 0; i < values.length-1; i++)
       {
           newArray[i+1] = values [i];
        }
        
       for(int i = 0; i < values.length; i++)
       {
           values[i] = newArray[i];
        }
    }
    
   public void evenToZero()
   {
    }
    
   public void removeMiddle()
   {
    }
}
