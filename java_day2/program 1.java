
import java.util.*;
class HelloWorld { 
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		int [] result =new int[n];
		int left=1;
		int right=1;
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		} 
		
		for(int i=0;i<arr.length;i++)
		{
		    result[i]=1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    result[i]*=left;
		    left*=arr[i];
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
		    result[i]*=right;
		    right*=arr[i];
		}
		System.out.print("product:");
		 	for(int i=0;i<arr.length;i++)
		{
		    System.out.print(result[i]+" ");
		}
		 
	
	} 
} 

