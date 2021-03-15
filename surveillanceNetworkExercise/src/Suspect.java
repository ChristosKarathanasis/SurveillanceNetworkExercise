import java.util.ArrayList;

public class Suspect {
     private String suspectName;
     private String suspectCodeName;
     private String suspectCountry;
     private String suspectActivityCity;
     
     private ArrayList<String> phoneNumbers =new ArrayList<String>();
     private ArrayList<Suspect> partners =new ArrayList<Suspect>();
	
     
     
     
     
	public Suspect(String suspectName, String suspectCodeName, String suspectCountry, String suspectActivityCity) {
		super();
		this.suspectName = suspectName;
		this.suspectCodeName = suspectCodeName;
		this.suspectCountry = suspectCountry;
		this.suspectActivityCity = suspectActivityCity;
		
	}
	public String getSuspectName() {
		return suspectName;
	}
	public void setSuspectName(String suspectName) {
		this.suspectName = suspectName;
	}
	public String getSuspectCodeName() {
		return suspectCodeName;
	}
	public void setSuspectCodeName(String suspectCodeName) {
		this.suspectCodeName = suspectCodeName;
	}
	public String getSuspectCountry() {
		return suspectCountry;
	}
	public void setSuspectCountry(String suspectCountry) {
		this.suspectCountry = suspectCountry;
	}
	public String getSuspectActivityCity() {
		return suspectActivityCity;
	}
	public void setSuspectActivityCity(String suspectActivityCity) {
		this.suspectActivityCity = suspectActivityCity;
	}
	public ArrayList<String> getPhoneNumber() {
		return phoneNumbers;
	}
	public void setPhoneNumber(ArrayList<String> phoneNumber) {
		this.phoneNumbers = phoneNumber;
	}
	public ArrayList<Suspect> getPartners() {
		return partners;
	}
	public void setPartners(ArrayList<Suspect> partners) {
		this.partners = partners;
	}
    
    public void addNumber(String aNumber) {
    	if(aNumber.equals("EXIT")) 
    		System.out.println("See you next time");
    	else {	
    	  boolean flag = false;
    	  for (String i : phoneNumbers) {
    		if(aNumber.equals(i))
    			flag = true;
    		    }
    	  if(flag) 
    		System.out.println("The number has already added");
    	  else {
    		phoneNumbers.add(aNumber);
    		System.out.println("The number has added successfully");
    	  }
    	} 	  
    }
    
public void PrintInfoOfThe() {
	for (String i : phoneNumbers) 
		System.out.println(i);
		}
}

