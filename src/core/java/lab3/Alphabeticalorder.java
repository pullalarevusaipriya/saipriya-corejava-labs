package core.java.lab3;

public class Alphabeticalorder{
	public static boolean isAlpha(String s){
		if (s == null) {
	        return false;
	    }

	    for (int i = 0; i < s.length(); i++)
	    {
	        char c = s.charAt(i);
	        if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args)
	{
	    String s = "ABCD";
	    System.out.println("IsAlpha: " + isAlpha(s));
}
}