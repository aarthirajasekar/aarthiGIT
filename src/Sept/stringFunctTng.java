package Sept;

public class stringFunctTng {
	public static void main(String[] args) {
		strFunc();
}
 public static void strFunc()
 {
	 String str1 = "Aarthi";
	 String str2 = "Vini";
	 String str3 = "Visi";
	 String str4 = "Raj";
	 String family = "   Aarthi, Vini, visi, Raj";
	 System.out.println(str1.length());// length of string
	 boolean eq = str1.equals(str4);
	 System.out.println(eq);// compares 2 strings
	 boolean eqIg = str1.equalsIgnoreCase(str4);//ignores case and returns boolean value
	 System.out.println(eqIg);
	 System.out.println("The string in upper case " +str1.toUpperCase());
	 System.out.println("The string in lower case "+str2.toLowerCase());
	 System.out.println("The extraction of particular character " +str3.charAt(3));//returns the char at the particular letter index value
	 System.out.println("The string that starts with " +str4.startsWith("R"));// returns boolean value
	 System.out.println("The string ends with " +str4.endsWith("j"));// returns boolean value
	 System.out.println("Replace the character with this character " +str1.replace('i','y'));
	 System.out.println("find a particular String wrt Character placemnet" +str1.contains("a"));
	 System.out.println("Find the substring of an string " +str1.substring(2));//indes atarts at 0, so substring of 2 is aar so post that the remainaing chrs are returned
	 System.out.println("Find the trimmed both for left and right spaces" +family.trim());// trims othleftand right blank spaces
	 System.out.println("Concat the strings at both left and right sides" +str1.concat(str2));
	 System.out.println("Check if the stringis emprty" +str1.isEmpty());
	 System.out.println("Check the index of " +str1.indexOf("r"));// index aklue starts with 0
	 String[] strArray = family.split(",");
	 for(String seperated : strArray)
	 {
		 System.out.println(seperated);
	 }
	  }
}