package collections;

import java.util.Scanner;

public class RetType
{
	String status = " ";
	public String lokesh(String name)
	{
		Boolean b;
		
		if(name.contains("java"))
		{
			
			b=true;
			
		}
		else
		{
			
			b=false;
		}
		
		
	return "he1lo";
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("which language you are learning");
		String output = scanner.next();
		RetType retType = new RetType();
		retType.lokesh(output);
		System.out.println(retType.status);
		
		

	}

}
