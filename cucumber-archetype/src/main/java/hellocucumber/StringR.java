package hellocucumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class StringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "geek for geek";
		char[] arr = input.toCharArray();
	List<Character> lis = new ArrayList<>();
	for(char c:arr)
	
		
		lis.add(c);
		Collections.reverse(lis);
		ListIterator li = lis.listIterator();
		while(li.hasNext())
			System.out.print(li.next());
		
		
	}

	}
