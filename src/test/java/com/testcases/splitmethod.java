package com.testcases;

public class splitmethod {
	
	public static void main(String args[])
	{
		String s="i-orderd-3-books-orderid:4255-from-the-store";
		String[] spl=s.split("-",5);
		for(int i=2;i<s.charAt(3);i++)
		{
		System.out.println(spl[i]);
	}
	
	}
}
