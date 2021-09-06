package file.arr;
import java.util.*;
public class arrbasic {
	
	
	public void arr() {
		
		int a[]= {10,20,30,40};
		//System.out.println(a[2]);
		
		int l=a.length;
		
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int s[]=new int[4];
		s[0]=10;
		s[1]=20;
		s[2]=30;
		s[3]=40;
	    System.out.println(s[0]);
	    
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the length : " + " ");
	    int size=scan.nextInt();
	    int value[]=new int[size];
	    
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println("enter the values ");
	    	
	    	value[i]=scan.nextInt();
	    }
		System.out.println("array elements : ");
	    for(int i=0;i<value.length;i++)
	    {
	    
	    	System.out.println(value[i]);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arrbasic ss=new arrbasic();
ss.arr();
	}

}
