package core.java.lab3;

import java.util.Scanner;

public class ReplacingConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 ReplacingConsonents p = new ReplacingConsonents();
         System.out.println("Enter a string");
         String string = s.next();
         System.out.println(p.alterString(string));
         s.close();
     }

	 public String alterString(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            for(int i=0;i<str.length();i++)
            {
                   char c = sbr.charAt(i);
                   if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                   {
                         sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                   }
            }
            return sbr.toString();

	}

}
