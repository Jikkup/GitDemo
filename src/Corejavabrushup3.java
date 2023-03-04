
public class Corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rahul shetty academy";
		String s5 = "hello";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul shetty academy";
		s.split("shetty");
		String [] splittedstring = s.split("shetty");
		System.out.println(splittedstring[0]);
		//System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
	  //  for(int i = 0; i<s.length();i++)
	   // {
	   // System.out.println(s.charAt(i))	;
	   // }
	    for(int i= s.length()-1; i>=0; i--)
	    {
	    	System.out.println(s.charAt(i))	;
	    }

		

	}

}
