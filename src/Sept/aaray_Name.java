package Sept;

public class aaray_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		litArray1 ();//Static method dont need any reference and memory allocation  
		nonlitArray1();// Static method dont need any reference and memory allocation  
		
	}
	public static void litArray1()
	{
		int[] literal = {4, 8, 9, 14, 45};//single dimensional array
		int len = literal.length; //extract the length
		
		for (int i =0; i<len; i++)
		{
			System.out.println("The length of thesingle dimensional array is " +len);
		}
		
	}
	
	public static void nonlitArray1()
	{
		int [] nonLiteral = new int[5];
		nonLiteral[0] = 25;
		nonLiteral[1] = 45;
		nonLiteral[2] = 45;
		nonLiteral[3] = 78;
		nonLiteral[4] = 89;
		for (int i : nonLiteral)
		{
			System.out.println(i);
			
			
		}
	}

}
