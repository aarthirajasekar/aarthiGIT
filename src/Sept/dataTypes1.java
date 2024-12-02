package Sept;

public class dataTypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataTypes1 dt1 = new dataTypes1();
		dt1.bytetype();
		dt1.shorttype();
		dt1.longtype();
		dt1.inttype();
		dt1.floattype();
		dt1.doubletype();
		dt1.booleantype();
		dt1.chartype();
		
	}

	public void bytetype()
	{
		byte serialnum = 127;
		System.out.println("Employee serial no is "+serialnum);
	}
	
	public void shorttype()
	{
		short pin = 1245;
		System.out.println("Employe pin no is"+pin);
	}
	public void inttype()
	{
	    int aadhar = 1256789632;
	    System.out.println("Aadhar no is "+aadhar);
	}
	public void longtype()
	{
		long mobnum = 124578895l;
		System.out.println("The mobile num is "+mobnum);
	}
	public void floattype()
	{
		float ctc = 4544.456f;
		System.out.println("The employee CTC is "+ctc);
	}
	public void doubletype()
	{
	    double bankbal = 5454445.56;
		System.out.println("The employee bankbalance is "+bankbal);
		
	}
	public void chartype()
	{
		char initial = 'E';
		System.out.println("The employee initial is "+initial);
	}
	
	public void booleantype()
	{
		boolean attend = true;
		System.out.println("The employeeattendance noted"+attend);
		
	}
	  
}

