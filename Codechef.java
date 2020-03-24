import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String name;
	    Scanner in=new Scanner(System.in);
	    name=in.nextLine();
	    char[] ch=name.toCharArray();
	    if(ch[0]=='A')
	    ch[0]=' ';
	    if(ch[1]=='A')
	    ch[1]=' ';
	    String NewString= new String(ch);
	    NewString=NewString.replaceAll("\\s", "");
	    System.out.println(NewString);
	}
}
