package file.str;
public class Strtypes {

	
	public void literalMethod()
	{
		System.out.println("Literal");
		String s="sabari";
		System.out.println(System.identityHashCode(s));
		String s1="sabari";
		System.out.println(System.identityHashCode(s1));
		
	}
	
	public void nonLiteralMethod()
	{
		System.out.println("Non Literal");
		String s=new String("sabari");
		System.out.println(System.identityHashCode(s));
		String s1=new String("sabari");
		System.out.println(System.identityHashCode(s1));
		
	}
	public static void main(String[] args) {
		Strtypes s = new Strtypes();
		s.literalMethod();
		s.nonLiteralMethod();
	}

}


