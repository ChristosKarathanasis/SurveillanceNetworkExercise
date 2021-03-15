import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
       PhoneCall phoneCall1 = new PhoneCall("6982440822","6982440823",1998,3,11,45.3);
       Suspect aSuspect = new Suspect("kara","aNickName","Greece","Athens");
       
       
       //phoneCall1.PrintInfo();
       
       Scanner console = new Scanner(System.in);
       String aNumber;
       do {
         System.out.print("Enter a new Number for the suspect's list \n");
         System.out.print("***If you want to exit type EXIT*** \n");
         aNumber = console.next();
         aSuspect.addNumber(aNumber);
       }while(!(aNumber.equals("EXIT")));
      
      
       
       
	}
	
	

}
