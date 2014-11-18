


/**
 * Write a description of class ArrayOperations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    public static void main(String[]args)
    {
        double[] array = {8,4,5,21,7,9,18,2,100};
        
        System.out.println("The length is: "+array.length);
        System.out.println();
        for(int i=0 ; i < 9 ; i++)
        {
            System.out.println(i+": "+array[i]);
        }
        System.out.println();
        System.out.println(array[array.length - 1]);
        System.out.println();
        for(int j = 8; j>= 0; j--)
        {
            System.out.println("\n" + j + ": " + array[j]);
        }
        
        for(int k = 0; k < 9; k++)
        {
            System.out.println(array[k]);
        }
    }

}
