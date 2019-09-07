package Filestream;

import java.io.*;

public class FileInputOutputStream {
	public static void main(String[] args) throws IOException
	{
File inputfile=new File("Exampleread.txt");
File outputfile=new File("Exampleoutput.txt");

FileInputStream in=new FileInputStream(inputfile);
FileOutputStream out=new FileOutputStream(outputfile);
int c;
while((c=in.read())!=-1)
{
	System.out.println(c);
	out.write(c);
}
//System.out.println("File is created");
in.close();
out.close();

}
}
