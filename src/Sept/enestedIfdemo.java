package Sept;

public class enestedIfdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enestedIfdemo nl = new enestedIfdemo();
		nl.nestedIfdemo();

	}

	public void nestedIfdemo()
	{
		long accno = 1245784555;
		int pin = 4512;
		double withdrawamt = 70000.00; 
		float accbal = 70000.00f;
		if (accno==1245784555) {
			if (pin==4512) {
				if (withdrawamt <= accbal) {
					System.out.println("You are eligible to withdraw amt from your account");
				}
			
				else {
					System.out.println("Yourwithdrawal amount exceeds account balance acmount");
				}
			}
				else {
					System.out.println("Your pin is incorrect");
				}
		}
				else {
					System.out.println("Your account no is invalid");
				}
				
				}
		
	}

	

