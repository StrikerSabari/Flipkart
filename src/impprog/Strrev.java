package impprog;

public class Strrev {
	
	public void strngrev ()
	{
		String s="my name is sabari";	

		
		
		String[] a = s.split(" ");
		int m=a.length;
    for (int i = m-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
			
		}
		public static void main(String[] args) {
		Strrev a= new Strrev();
		a.strngrev();

	}

}
