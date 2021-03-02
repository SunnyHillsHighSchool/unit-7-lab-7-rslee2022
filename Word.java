//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
        //This String of vowels exists so that we can check if a certain character of the String s instance variable exists within this string. If it does, it would mean that the character is a vowel. Otherwise, the character is a consonant.
   																//why is it static?
                                   //This private instance variable is static so that it's linked to the class rather than the Word object.
   
   //add an instance variable
   private String s;

	//create 2 constructors
	public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

  public void setWord(String newS)
  {
    s = newS;
  }

	//create other methods
  //getLength method
  public int getLength()
  {
    //return length of the string s (private instance variable)
    return s.length();
  }

  //getNumVowels method
  public int getNumVowels()
  {
    //create variable int numVowels, set to 0
    int numVowels = 0;
    //for loop: set loop control variable int i equal to 0, condition - i is less than length of string s (private instance variable), i increments by one
    for(int i = 0; i < s.length(); i++)
    {
      //if the character at index i of String s is an index of string vowels (meaning, if it exists in string vowels)
      if(vowels.indexOf(s.charAt(i)) != -1)
      {
        //increment numVowels by one
        numVowels++;
      }
    }
      //return numVowels
      return numVowels;
  }
  

	//look at the sample runner code
	//on the lab handout

	//create a toString method
  public String toString()
  {
    return s;
  }
}