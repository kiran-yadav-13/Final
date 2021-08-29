import java.io.*;
class NegExe extends Exception
{
	String str;
	NegExe(String s)
	{
		str=s;
	}
	public String toString()
	{
		return str;
	}
}
public class NegativeNumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of array ");
try
{
	n=Integer.parseInt(br.readLine());
	a=new int[n];
	System.out.println("Enter "+n+" elemnts in an array");
	for(int i=0; i<n; i++)
	{
		try
		{
			a[i]=Integer.parseInt(br.readLine());
			if(a[i]<0)
				throw new NegExe("Number you entered is negative"+a[i]);
		}
		catch(NegExe e)
		{
			System.out.println(e);
		}
	}
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
