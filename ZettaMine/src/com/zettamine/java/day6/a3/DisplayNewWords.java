package com.zettamine.java.day6.a3;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DisplayNewWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String sen[] = sentence.split(" ");
		List<String> word = new ArrayList<String>();
		for(String s:sen) {
			String s1 = "";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
					s1=s1+ch;
				}
			}
			word.add(s1);
		}
		Set<String> newWord = new TreeSet<String>();
		for(String sent: word)
		{
			newWord.add(sent.toLowerCase());
		}
		System.out.println(Arrays.toString(sen));
		System.out.println("No.of Words: "+word.size());
		System.out.println("No.of Unique words: "+newWord.size());
		int a=1;
		for(String w :newWord)
		{
			System.out.println(a+". "+w);
			a++;
		}
	}
}
