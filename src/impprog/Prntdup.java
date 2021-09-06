package impprog;

import java.util.HashMap;

public class Prntdup {
	public void printduplicates()
	{
		String s="antartica";
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
char[] sa = s.toCharArray();
		for (char c : sa) 
		{
			if(obj.containsKey(c))
			{
				Integer i = obj.get(c);
				i++;
				obj.put(c, i);
			}
			else
			{
				obj.put(c, 1);	
			}
		}
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Prntdup a=new Prntdup();
		a.printduplicates();

	}

}
