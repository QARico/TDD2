package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTest 
{
	public static void main(String[] args) 
	{
		listGen(5);	
	}
	
	public static int factorial(int number) 
	{
		int factorial = 1;
		for (int i = 1; i <= number; i++) 
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return number;
	}
	
	public static int getVowel(String input) 
	{
		int vowelCount = 0;
		for (int i = 0 ; i < input.length() ; i++)
		{
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		return vowelCount;
	}
	
	public static boolean isPrime(int num) 
	{
		boolean checker = true;
		
		for(int i = 2; i <= num/2; ++i)
		{
			if(num % i == 0)
			{
				checker = false;
				break;
			}
		}
		System.out.println(checker);
		return checker;
	}
	
	public static int returnPosition(String input, char letter) 
	{
		int output = 0;		
		input = input.replaceAll("\\s+", "");
		
		if (input.indexOf(letter) != -1)
		{
			System.out.println(input);
			output = input.indexOf(letter);
		}
		else
		{
			System.out.println("error");
			return -1;
		}
		System.out.println(output + 1);
		return output + 1;
}
	
	public static int listGen(int a) 
	{
		List<Integer> list = new ArrayList<Integer>(5);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(200 - 100 + 1) + 100 ;
		for (int i = 0; i < 5; i++) 
		{
			list.add(randomInt);
		}
		
		return 0;
	}
	
	
}
