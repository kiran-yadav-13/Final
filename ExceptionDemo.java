import java.io.*;
class UnderAge extends Exception
{ int age;
	UnderAge(int x)
	{
		age=x;
	}
	public String toString() {
		return "Under age "+age;
	}
}
public class ExceptionDemo {
	static void test(int y) throws UnderAge
	{
		if(y<18)
			throw new UnderAge(y);
		else
			System.out.println("Age is "+y);
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String  ch="y";
do {

System.out.println("Enter the age ");
int a = Integer.parseInt(br.readLine());
try
{
	test(a);
}
catch(UnderAge e)
{
	System.out.println(e);
	
}
System.out.println("do you want to continue?");
ch=br.readLine();
	}while(ch.equals("y"));
	}

}
