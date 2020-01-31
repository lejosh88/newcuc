package hellocucumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ibm.icu.impl.UResource.Array;

public class Arras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Arra = new String[5];
		Arra[0] = "20";
		Arra[1] = "21";
		Arra[2] = "20";
		Arra[3] = "20";
		Arra[4] = "22";
		int count =0;
List<String> list = Arrays.asList(Arra);
Set <String> set = new HashSet<String>();
for(String str:list)
{
	if(set.add(str)==false)
	{
		//System.out.print(str);  
		count++;
	}
}
System.out.print(count); 
	}

}
