package test_p21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_p21{

	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݧA�n��ԣ���u?");
		System.out.println("�п�J���");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char and = (res == 1) ?'A':'B';
		System.out.println("��ܤF" +and +"���u");
	}
}
