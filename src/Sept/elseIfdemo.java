package Sept;

public class elseIfdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elseIfdemo elsif = new elseIfdemo();
		elsif.elseIfdemo1();
	}
	
	public void elseIfdemo1()
	{
		String course1 = "Java";
		
		String course2 = "Selenium";
		
		if (course1=="Java") {
			System.out.println("You belong to testing cadre1");
		}
		else if(course2=="Selenium") {
			System.out.println("You belong to testing cadre2");
		}
		else {
			System.out.println("You DONT belong to testing cadre");
		}
	}

}
