package Filestream;

public class SimpleEncryptionMain {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		String a0,a1,a2 = null;
		if(args.length!=4)
		{
			a0="words.txt";
			a1="wordsencrypt.txt";
			a2="1";
		}
		else
		{
			a0=args[0];
			a1=args[1];
			a2=args[2];
		}
		SimpleEncryption se=new SimpleEncryption();
		se.encrypt(a0, a1,Integer.parseInt(a2));
		System.out.println("Encrypted file");
		se.viewFilecontent(a1);
		//System.out.println("Vowel file");
		//se.viewFilecontent(a2);

	}

}
