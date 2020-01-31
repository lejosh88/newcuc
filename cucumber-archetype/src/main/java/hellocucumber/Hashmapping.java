package hellocucumber;

import java.util.HashMap;
import java.util.Map;

public class Hashmapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		String Str ="Indissaaaa";
		char[] in = Str.toCharArray();
		for(char c:in)
		{
		
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
				
			}
			else
			{
				
				hm.put(c,1);
			}
		}
		for( Map.Entry entry :hm.entrySet())
		{
			System.out.print(entry.getKey() +""+  entry.getValue());
		}
	}

}
