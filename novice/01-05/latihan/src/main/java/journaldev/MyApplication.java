public class MyApplication {

	private EmailService email = new EmailService();
	
	public void processMessages(String msg, String rec){
		this.email.sendEmail(msg, rec);
	}
}