package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}


	/**
	 * Given a string and a char, return the position in the String where the char first appears.
	 * Ensure the positions are numbered correctly, please refer to the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) 
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

	/**
	 * Given two Strings of equal length, 'merge' them into one String.
	 * Do this by 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) 
	{
		char[] a = input1.toCharArray();
		char[] b = input2.toCharArray();
		
		List <Character> list = new ArrayList(Arrays.asList(a));
		
		 for (int i = 0; i < a.length; i++) 
		 {
			 list.add(i, (char) a.length);
			for (int j = 0; j < b.length; j++) 
			{
				list.add(i, (char) b.length);
			}
		 }
		return "";
	}

	
	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"} 
	 */
	public String[] removeDuplicates(String[] stringArray) 
	{
		
		return null;
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445" <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line. <br>
	 * For each record, if it is not encrypted, return the names of the owners of the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		return null;
	}

	
	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100 and 200 inclusive. <br>
	 *  <br>
	 * For Example:     <br>
	 * listGen() → {100,102,122,198,200}  <br>
	 * listGen() → {108,104,106,188,200}  <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() 
	{
			List<Integer> list = new ArrayList<Integer>(5);
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(200 - 100 + 1) + 100 ;
			for (int i = 0; i < 5; i++) 
			{
				list.add(randomInt);
			}
			
			return new list;
	}


	/**
	 * A prime number is one which is only divisible by one and itself.  <br>
	 * Write a function which returns the boolean True if a number is prime, and the boolean False if not. <br>
	 *  <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) 
	{
			boolean checker = true;
			
			for(int i = 2; i <= num/2; ++i)
			{
				if(num % i == 0)
				{
					checker = false;
				}
			}
			return checker;
	}

	/**
	 * Write a function which returns the number of vowels in a given string.  <br>
	 * You should ignore case. <br>
	 *  <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2  <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) 
	{
		int vowelCount = 0;
		input.toLowerCase();
		for (int i = 0 ; i < input.length() ; i++)
		{
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

			{
				vowelCount++;
			}
		}
		return vowelCount;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean True, if not return the boolean False.  <br>
	 *  <br>
	 * For Example:  <br>
	 * wordFinder("dog", "god") → True  <br>
	 * wordFinder("tiredest", "tree") → True  <br>
	 * wordFinder("dog", "cat") → False  <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) 
	
	{
		return false;
	}
	

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		return false;
	}

	/**
	 * 	A factorial is the product of itself and all previous numbers  <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6  <br>
	 *  <br>
	 * Write a function which can compute the factorial of a given number between 1 and 10 inclusive.   <br>
	 *   <br>
	 * For Example:  <br>
	 * factorial(1) → 1  <br>
	 * factorial(4) → 24  <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) 
	{
		int factorial = 1;
		for (int i = 1; i <= number; i++) 
		{
			factorial = factorial * i;
		}
		return factorial;
	}

}
