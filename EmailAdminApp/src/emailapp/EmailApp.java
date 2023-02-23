package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Fred", "Flintstone");
		
		//We can then call the methods to change the variables
		em1.setMailbxCapacity(750);
		System.out.println(em1.getMailboxcapacity());
		em1.setAlternateEmail("emailaddress@email.com");
		System.out.println(em1.getAlternateEmail());
		em1.changePassword("NewSecurePassword");

		System.out.println(em1.showInfo());
	}

}
