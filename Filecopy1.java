import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	   FileInputStream f1=null;
	   FileOutputStream f2=null;
	   int i;
	  
	   if(args.length !=2)
	   {
		   System.out.println("File name not mentioned");
	   }
	   try
	   {
		   f1=new FileInputStream(args[0]);
		   f2=new FileOutputStream(args[1]);
		   do
		   {
			   i=f1.read();
			   if(i != -1)
			   {
				   f2.write(i);
			   }
		   }while(i != -1);
	   }
	   catch(FileNotFoundException o)
	   {
		   System.out.println(o);
	   }
	}

}
