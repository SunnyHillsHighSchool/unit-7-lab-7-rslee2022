//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    words = new ArrayList<Word>();
    
    for(String s : wordList)
    {
      words.add(new Word(s));
    }
	}

  //method to return the count of words that have a particular number of characters
  //parameter: integer size (number of characters)
	public int countWordsWithXChars(int size)
	{
    //create integer variable count for count of words
    int count= 0;
    //For each loop, loop variable Word i, traverse through arraylist of words
    for(Word i : words)
    {
      //if the length of Word i is equal to size
      if(i.getLength() == size)
        //increment count by 1
        count++;
    }
    //return count
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
  //parameter: integer size (number of characters)
	public int removeWordsWithXChars(int size)
	{
    //create integer variable numVowels for total number of vowels
    int numVowels = 0;
    //for loop, set loop control variable integer i to size of arraylist words minus 1, condition - i is greater than or equal to 0, i decrements by 1
    for(int i = words.size() - 1; i >= 0; i--)
    {
      //if the length of the Word at index i is equal to size (parameter)
      if(words.get(i).getLength() == size)
      {
        //add the number of vowels for the Word at index i of arraylist words to numVowels
        numVowels += words.get(i).getNumVowels();
        //remove the word from arraylist
        words.remove(i);
      }
    }
    //return numVowels
		return numVowels;
	}

  //method to return count of words with a certain number of vowels
  //parameter: integer numVowels (number of vowels)
	public int countWordsWithXVowels(int numVowels)
	{
    //create integer variable count for number of words with certain number of vowels
    int count = 0;
    //for each loop, loop variable Word i, traverse through arraylist words
    for(Word i : words)
    {
      //if the number of vowels in Word i is equal to numVowels
      if(i.getNumVowels() == numVowels)
      {
        //increment count by 1
        count++;
      }
    }
    //return count
		return count;
	}
	
	//add in a toString
  public String toString()
  {
    return "" + words;
  }
}