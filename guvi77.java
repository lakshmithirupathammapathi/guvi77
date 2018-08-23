import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
