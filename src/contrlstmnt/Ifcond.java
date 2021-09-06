package contrlstmnt;

public class Ifcond {
	
	public void cond() {
		
	 int a=50;
	 
	 if(a<30)
	 {
	  System.out.println("a is less than 30");
	 }
	 else if(a>=50)
	 {
		 System.out.println("a is greater or equal to 50");
		
	 }
	 else
	 {
		 System.out.println("none of the above");
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifcond ss=new Ifcond();
		ss.cond();

	}

}
