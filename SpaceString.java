import java.util.HashMap;
import java.util.Map;

public class SpaceString
{
  public static void main(String[] args) 
  {
	String s="naga mani";
	System.out.println(s);
	String[] s1=s.split(" ");
	Map<String ,Integer> s2=new HashMap<String,Integer>();
	for(String c:s1)
	{
		if(s2.containsKey(c))
		{
		int x=s2.get(c);
		s2.put(c,x+1);
		}
		else
		{
			s2.put(c, 1);
		}
	}
	
  }
}
