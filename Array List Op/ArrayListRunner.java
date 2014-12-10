import java.util.ArrayList;

public class ArrayListRunner
{
   ArrayList<String> names = new ArrayList<String>();
   public static void main(String[] args)
   {   
       
   }
   public void add(String name)
   {
       names.add(name);
    }
   public void get()
   {
    String str = "";
       for(int i=0;i<names.size();i+=2)
       {
        str += names.get(i)+ names.get(i+1);
    }
    }
   public void size()
   { 
       for(int i = 1;i<names.size();i+=2)
       {
           names.get(i);
        }
    }
   public void set()
   {
    }
} 