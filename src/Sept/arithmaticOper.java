package Sept;

public class arithmaticOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmaticOper ao = new arithmaticOper();
		ao.arithmeticadd();
		ao.arithmeticminus();
		ao.arthmeticmul();
		ao.div();
		ao.module();
	}

	public void arithmeticadd()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The addition of 2 no's is "+c);
	}
	public void arithmeticminus()
	{
		int a = 10;
		int b = 5;
		int d = a-b;
		System.out.println("The minus of 2 no's is "+d);
	}
	public void arthmeticmul()
	{
		int a = 10;
		int b = 4;
		int e = a*b;
		System.out.println("The multipplication of 2 no's is "+e);
	}
	public void div()
	{
		int a = 10;
		int b = 2;
		int f = a/b;
		System.out.println("The quotentent is "+f);
		}
	public void module()
	{
		int a = 20;
		int b = 10;
		int g = a%b;
		System.out.println("The reminder is "+g);
	}
	
}
