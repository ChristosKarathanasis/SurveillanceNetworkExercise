
public class PhoneCall extends Communications{
	
	
	private double phoneCallDuration;

	
	
	public PhoneCall(String communicationNumber1, String communicationNumber2, int communicationYear,
			int communicationMonth, int communicationDay, double phoneCallDuration) {
		super(communicationNumber1, communicationNumber2, communicationYear, communicationMonth, communicationDay);
		this.phoneCallDuration = phoneCallDuration;
	}



	public void PrintInfo() {
		
		System.out.println("First Number: " + communicationNumber1);
		System.out.println("Second Number: " + communicationNumber2);
		System.out.println("---Date of Call---");
		System.out.println("Year:" + communicationYear+ "\n" + "Month:"+ communicationMonth + "\n" + "Day:"+ communicationDay);
		
	}

}
