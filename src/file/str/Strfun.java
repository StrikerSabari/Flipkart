package file.str;



public class Strfun {
	
public void strfunc() {
		String a="tamanna";
		String a1="Tamanna";
		String s="sabarinath";
		System.out.println(s.length());
		System.out.println(s.equals(a));
		System.out.println(a.equalsIgnoreCase(a1));
		System.out.println(s.split(s));
		System.out.println(s.indexOf(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strfun sf=new Strfun();
		sf.strfunc();
	}

}
