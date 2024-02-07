package Number_Guessing;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Numberguessing {
public static void numberGuessing()
{
	Scanner sc=new Scanner(System.in);
	int number = 1 + (int)(50
			* Math.random());
	
	int k=5;
	int i;
	System.out.println("this is number guessing game between 1 to 50");
	
	for(i=0;i<k;i++)
	{
		System.out.println("guess the number:");
		
		int g=sc.nextInt();
		if(number ==g)
		{
			System.out.println("congratulations you are winner");
		}
		else if(number<g)
		{
			System.out.println("number is too low than what you guess");
		}
		else if(number>g)
		{
			System.out.println("number is too high than what you guess");
		}
		
	}
	if(i==k)
	{
		System.out.println("you are try 5 time......now game is over");
		
		System.out.println("the number is "+number);
	}
	sc.close();
	
}
public static void main(String[] args) {
	numberGuessing();
	
}
}
