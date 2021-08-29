import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream f1=null;
int i,i1;
char ch,ch1,ch2;
if(args.length!=1) {
	System.out.println("file not found");
}
try
{
	f1=new FileInputStream(args[0]);
	do {
	i=f1.read();
	if(i!=-1)
	{
		i1=f1.read();
		ch=(char)i;
		ch1=(char)i1;
		do
		{
			ch2=(char)f1.read();
			if(ch=='/' && ch1=='/') 
			{
				System.out.print(ch2);
			}
			
		}while(ch2!='\n');
	}
	}while(i!=-1);
	
}catch(FileNotFoundException o)
{
	System.out.println(0);
}
catch(IOException e )
{
	System.out.println(e);
}
	}

}
