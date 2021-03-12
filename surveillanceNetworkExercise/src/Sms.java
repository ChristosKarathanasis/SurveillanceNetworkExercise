
public class Sms extends Communications {
	private String smsContent;

	public Sms(String communicationNumber1, String communicationNumber2, int communicationYear, int communicationMonth,
			int communicationDay, String smsContent) {
		super(communicationNumber1, communicationNumber2, communicationYear, communicationMonth, communicationDay);
		this.smsContent = smsContent;
	}

	
	
	

}
