package interviewprog;

public class Strrev {
	
	public void strrevr() {
		int a[]={4,7,2,6,1,4,8,5,3,9};
		
		
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];  
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int l=a.length;
		System.out.println(a[1]);
	}

	public static void main(String[] args) {
		
		Strrev s =new Strrev();
        s.strrevr();
	}

}
