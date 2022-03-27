/**
 * Sentence Smash
 * Write a function that takes an array of words and smashes them together into a sentence 
 * and returns the sentence. You can ignore any need to sanitize words or add punctuation, 
 * but you should add spaces between each word. Be careful, there shouldn't be a space at 
 * the beginning or the end of the sentence!
 * 
 * Example
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */
package com.dia.uno;
/**
 * @author ledes
 *
 */
public class SmashWords {
	
	public static String smash(String... words) {
		
		String phrase = new String();
		
		if(words.length==0) {
			phrase = "";
		}else {
			
			int aux =0;
			
			if(words[0].isBlank()) {
				aux = 1;
			}
			
			for(int i=aux;i<words.length;i++)	{
				phrase += words[i];
				if(i!=words.length-1)
					phrase += " ";
				else 
					i++;
			}
		}
		return phrase;
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smash(new String[] {"hello", "world", "this", "is", "great"});
		smash(new String[] {" ", "hello", "world", "this", "is", "great"});
		smash(new String[] {"hello"});
		smash(new String[] {" "});
	}

}
