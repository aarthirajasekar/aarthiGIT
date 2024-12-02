package Sept;

public class relationalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relationalOper ro1 = new relationalOper();
		ro1.relationalequal();
		ro1.relationgreater();
	}

	public void relationalequal()
	{
	int a = 10;
	int b = 20;
	boolean c = (a==b);
	System.out.println("The value of a and b is equal"+c);
	}
	public void relationgreater()
	{
		int a = 10;
		int b = 20;
		boolean d = (a >= b);
		System.out.println("The value of a is greaterthan b?"+ d);
	}
}


