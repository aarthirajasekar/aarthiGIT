package Sept;
import java.util.ArrayList;
import java.util.List;

public class arrayListTrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listr = new ArrayList<String>();
		listr.add("Aarthi");
		listr.add("bhuvan");
		listr.add("Kamesh");
		listr.add(null);// add null value//
		listr.add(null); //add multiple null value//
		listr.add("Aarthi"); //add duplicate value//
		System.out.println(listr);
		for (int i = 0;i < listr.size(); i++)
		{
			System.out.println(listr.get(i));
		}

	}

}
