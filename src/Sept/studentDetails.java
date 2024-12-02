package Sept;

public class studentDetails extends abstraction_Class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDetails SD = new studentDetails();
		SD.sId();
		SD.sName();
		SD.studentParentOffice();
		SD.studentParentQuali();

	}

	public void studentParentOffice()
	{
		System.out.println("The parent office Avadi");
	}
	public void studentParentQuali()
	{
		System.out.println("The parent Qualification MCA");
	}
}
