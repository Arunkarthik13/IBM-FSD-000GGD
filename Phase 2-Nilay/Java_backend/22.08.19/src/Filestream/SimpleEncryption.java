package Filestream;

import java.io.*;


public class SimpleEncryption {
void encrypt(String source,String dest,int shiftSize)
{
	BufferedReader reader;
	BufferedWriter writer;
	try
	{
		reader=new BufferedReader(new FileReader(source));
		writer=new BufferedWriter(new FileWriter(dest));
		String line=reader.readLine();
		int data;
		int vowel;
		while(line!=null)
		{
			for(int i=0;i<line.length();i++)
			{
				
					data=(int)line.charAt(i)+shiftSize;
				writer.write(data);
			}
			writer.write((int)' ');
			for(int i=0;i<line.length();i++)
			{
				if(line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u'||
						line.charAt(i)=='A'||line.charAt(i)=='E'||line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U')
				{
					data=(int)line.charAt(i);
				writer.write(data);
				}
			}
			writer.write((int)'\n');
			line=reader.readLine();
			
		}
		reader.close();
		writer.close();
	}
	catch(IOException e)
	{
		System.out.println("Failed encrypting");
	}
}
public void viewFilecontent(String filename)
{
	BufferedReader reader;
	try {
		reader=new BufferedReader(new FileReader(filename));
		String line=reader.readLine();
		while(line!=null)
		{
			for(int i=0;i<line.length();i++)
			{
				System.out.println(line);
			}
			line=reader.readLine();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
