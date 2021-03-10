import java.util.ArrayList;

public class Suspect {
     private String suspectName;
     private String suspectCodeName;
     private String suspectCountry;
     private String suspectActivityCity;
     
     private ArrayList<int[]> phoneNumber =new ArrayList<int[]>();
     private ArrayList<Suspect> partners =new ArrayList<Suspect>();
	
     
     
     
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
	public ArrayList<int[]> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(ArrayList<int[]> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ArrayList<Suspect> getPartners() {
		return partners;
	}
	public void setPartners(ArrayList<Suspect> partners) {
		this.partners = partners;
	}
    
     
     
}
