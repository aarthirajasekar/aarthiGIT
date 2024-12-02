package Sept;

public class multiArrayTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi_Lit();
		multi_Nonlit();
	}
	
	public static void multi_Lit()
	{
		int[][] multiLit = {{16,27},{14,45}};
		for (int i=0; i<multiLit.length; i++)
		{
			for (int j=0; j<multiLit.length; j++)
			{
				System.out.print("Multi dimensional array is" +multiLit[i][j]);
			}
				System.out.println();
		}
		
	}
	public static void multi_Nonlit()
	{
		int[][] multiNonLit = new int[2][2];
		multiNonLit[0][0] = 45;
		multiNonLit[0][1] = 78;
		multiNonLit[1][0] = 45;
		multiNonLit[1][1] = 23;
		for (int a[]:multiNonLit)
		{
			for (int b:a)
			{
				System.out.println(b+" ");
			}
		}
		        System.out.println(" ");
		} 
		
	}

