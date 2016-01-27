/**
 *
 * @author Chris Hall
 */

import java.io.*;

public class Lab_13 
{
	public static void main(String[] args)
	{
		try{
			FileReader fr = new FileReader("C:\\JavaFiles\\myFile.txt");
			while (fr.ready()){
				char c = (char)(fr.read());
                                System.out.println(c);
			}
			fr.close();
		}catch (IOException e){
			System.out.println("Error" +e.toString());
		}
	}
}
