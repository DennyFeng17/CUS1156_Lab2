/*Project: Lab2
 * Class: UniqueWords.java
 * Author:Denny Feng
 * February 28th, 2021
 * Finished method that counts number of unique words in an arraylist; to be uploaded to github
 *
 */
import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {	for (int j = 0; j < list.size(); j++)
		 {if(i==j)
		count+=1;
   	  if(list.get(i)==list.get(j))
		 {break;}

			
		 }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
