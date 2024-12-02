package Sept;

public class overridingTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overridingTraining ort = new overridingTraining();
		
		ort.login("Aarthi",4578);
		ort.logint("AarthiL","L");
	}
	
	public void login(String name, int pwd)
	{
		System.out.println("Enter the user id");
		System.out.println("Enter the password");
	}

	public void login(String name, char pwd)
	
	{
		System.out.println("The twitter id pls");
		System.out.println("Key in the password");
	}
}
