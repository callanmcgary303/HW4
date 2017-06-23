/**
 * Check details
 * @author Callan McGary 
 */
import java.io.Serializable
public class impliments Serializable check
	{
	 public String num;
	 public double amt;
	 public String pay;
	 public String why;
//Constructor for objects of class Check
public check(String checkNumber, double amount, 
		String payee, String reason)
{
	       num = checkNumber;
	       amt = amount;
	       pay = payee;
	       why = reason;
	    }
	        public String getcheckNumber()
	    {return num;}
	       public double getamount()
	    {return amt;}
	       public String getpayee()
	    {return pay;}
	       public String getreason()
	    {return why;}
	 
	    public void printCheck()
	    {
	        System.out.println("Callan McGary                            " + num);
	        System.out.println("Pay to the Order of: " + pay + "      $" + amt);
	        System.out.println("Memo: " + why);

	    }
	}
import java.io.*; 
public check Persist{
	check c1 = (001, 125.00, Bookstore, coding book,)
}
			try{
				FileOutputStream F = new FileOutputStream("f.txt");
				ObjectOutputStream out = new ObjectOutputStream(f);
				
				out.writeObject(c1); //what we serialize
				out.flush(); 
			}
	catch (IOException e){
		e.printStackTrace();
		System.out.println("Unable to serialize the object);
	}
}