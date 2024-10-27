import java.io.*;
import java.util.*;

// Driver Class
class Test
{
    // main function
    public static void main (String[] args)
    {
        String s= "Christmas";
        // or String s= new String("Christmas");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = " + s.charAt(3));

        // Return the substring from the ith index character to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));

        // Concatenates string2 to the end of string1.
        String s1 = "Christmas";
        String s2 = "Holiday";
        System.out.println("Concatenated string  = " +  s1.concat(s2));

        // Returns the index within the string of the first occurrence of the specified string.
        String s4 = "Merry Christmas Merry";
        System.out.println("Index of Christmas " +  s4.indexOf("Christmas"));

        // Returns the index within the string of the first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " +   s4indexOf('a',3));

        // Checking equality of Strings
        Boolean out = "Christmas".equals("holiday");
        System.out.println("Checking Equality  " + out);
        out = "Christmas".equals("Christmas");
        System.out.println("Checking Equality  " + out);

        out = "Christmas".equalsIgnoreCase("chRisTmas ");
        System.out.println("Checking Equality " + out);

        // If ASCII difference is zero, then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("The difference between ASCII value is = " + out1);

        // Converting cases
        String word1 = "ChristMasTime";
        System.out.println("Changing to lower Case " + word1.toLowerCase());

        // Converting cases
        String word2 = "christmasEVE";
        System.out.println("Changing to UPPER Case " +  word2.toUpperCase());

        // Trimming the word
        String word4 = " Christmas Holiday ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "chrismaschris";
        System.out.println("Original String " + str1);
        String str2 = "chrismaschris".replace('c' ,'p') ;
        System.out.println("Replaced 'c' with 'p' -> " + str2);
    }
}
