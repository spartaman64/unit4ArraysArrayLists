

/**
 * Write a description of class TopCustomers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopCustomers
{
    String[] Name;
    double[] Amount;
    int num = 0;
    public void addSale(String customerName, double amount)
    {
        num +=1;
        Name[num]= customerName;
        Amount[num] = amount;
    }
    public String nameOfBestCustomer()
    {
        double biggest = 0;
        int place = 0;
        for(int i = 0;i < num;i++)
        {
            if(Amount[i]>biggest)
            {
                biggest=Amount[i];
                place = i;
            }
        }
        return Name[place];
    }
}
