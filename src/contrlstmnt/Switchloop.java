package contrlstmnt;

public class Switchloop {
	
	public void switchst() {
		char s='M';
		switch(s) {
		
		case 'S':
			System.out.println("it is s");
		break;	
		case 'M':
			System.out.println("it is m ");
			break;
		case 'K':
			System.out.println("it is k");
		break;
		default:
			System.out.println("enter correct value");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchloop ss=new Switchloop();
		ss.switchst();

	}

}
