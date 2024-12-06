package corejava;

import java.util.Scanner;

public class Constate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("eligible for the voting");
		}
		else
		{
			System.out.println("Not eligible for the voting");
		}
	}

}
