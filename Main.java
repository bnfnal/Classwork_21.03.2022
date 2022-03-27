import java.util.Scanner;

// Task 1: If you can't sleep, just count sheep!! 

public class CountingSheeps 
{
  public static String countingSheep(int n) {
    String res = "";
    for (int i = 1; i<n+1; i++){
            res += i + " sheep...";
        }
    return res;
  }
}

// Task 2: Jaden Casing Strings

public class JadenCase 
{
  public String toJadenCase(String phrase) 
  {
    if (phrase == "" || phrase == null) return null;
    String[] words = phrase.split(" ");
    String res = "";
		for (int i = 0; i<words.length; i++)
    {
      res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length());
      if (i<words.length-1) res += " ";
    }
    return res;
  }
}

// Task 3: You're a square!

import java.util.Arrays;

public class Square 
{    
    public static boolean isSquare(int n) 
    { 
      if (n < 0) return false;
      if (n == 0) return true;
      for (int i = 1; i < (int)Math.sqrt(n) + 1; i++)
      {
        if (n == i*i) return true;
      }
        return false;
    }
}
