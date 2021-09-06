package contrlstmnt;

public class whileloop {
	
	public void whloop() {
		int a=2;
		while (a<=15)
		{
			System.out.println(a);
			a++;
			continue;
		}
		}
	
	public void dowhil() {
		int a=2;
		do {
			System.out.println(a);
			a++;
		}
			
		
		while(a>10);
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileloop ss=new whileloop();
		//ss.whloop();
		ss.dowhil();
	}

}
