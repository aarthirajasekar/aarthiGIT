package Sept;

public class GrandChildClass extends parentClass {
	public static void main (String args[])
	{
		
		GrandChildClass gc = new GrandChildClass();
		gc.pager();
		gc.telegram();
		gc.mobile();
		System.out.println("We have seen telegrm, Pager and Mobiles throughout aour ages");
	}
	
	public void mobile()
	{
		System.out.println("we use Mobile currently in our ages");
	}

}
