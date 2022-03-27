# Classwork_21.03.2022

## **Task 1: If you can't sleep, just count sheep!!**

### **Class:** 
                IfYouCantSleep
### **Function:**   
                countingSheep(int n)

### **Task:**

Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". 
Input will always be valid, i.e. no negative integers.

### **Favorite solution:**


    class Kata 
    {
      public static String countingSheep(int num) 
      {
         StringBuilder result = new StringBuilder();
         for (int i = 1; i <= num; i++) 
          {
             result.append(String.format("%d sheep...", i));
          }
          return result.toString();
      }
    }



## **Task 2: Jaden Casing Strings**

### **Class:** 
                JadenCase
### **Function:** 
                toJadenCase(String phrase) 

### **Task:**
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
Note that the Java version expects a return value of null for an empty string or null.


### **Example:**

    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"


### **Favorite solution:**


    public class JadenCase 
    {
      public String toJadenCase(String phrase) 
      {
        String result  = "";
        if (phrase == null || phrase.equals("")) return null;
        String[] s = phrase.split(" ");
        for (int i = 0; i < s.length; i++) result += (s[i].substring(0,1)).toUpperCase() + s[i].substring(1) + " ";
        return result.trim() ;
      }
    }


## **Task 3: You're a square!**

### **Class:** 
                Square
### **Function:** 
                isSquare(int n)

### **Task:**

**A square of squares**

You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

**Task**

Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will always use some integral number, so don't worry about that in dynamic typed languages.

### **Example:**
-1  =>  false
 0  =>  true
 3  =>  false
 4  =>  true
25  =>  true
26  =>  false

### **Favorite solution:**


    public class Square 
    {    
       public static boolean isSquare(int n) 
       {        
        return Math.sqrt(n)%1 == 0;
       }
    }

