import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
       PhoneCall phoneCall1 = new PhoneCall("6982440822","6982440823",1998,3,11,45.3);
       Suspect aSuspect = new Suspect("kara","aNickName","Greece","Athens");
       
       
       //phoneCall1.PrintInfo();
       
       //Scanner console = new Scanner(System.in);

       
       //System.out.print("Enter a new Number for the suspect's list \n");
       //String aNumber = console.next();
       String aNumber = "6982440822";
       aSuspect.addNumber(aNumber);
      // aSuspect.PrintInfoOfThe();
       
	}
	
	

}
