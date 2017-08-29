package TestNG2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by kknochenmus on 7/12/17.
 */
public class Strings {

    //String str1 = "Hello Kelly";
    //String str2 = "  Hello Kelly Spaces  ";


    public void printVariableValues(String str1, String str2) {
        System.out.println("String 1 Value = '"+str1+"'");
        System.out.println("String 2 Value = '"+str2+"'");
        System.out.println("%%% End of printVariableValues Method %%%");
        System.out.println("");
    }


    public void charAtAndIndexOf(String str1) {

        //charAt
        System.out.println("Character at Index 6 in str1 = " + str1.charAt(6));

        //indexOf
        System.out.println("Index of 'K' in str1 = "+str1.indexOf("K"));

        System.out.println("%%% End of charAtAndIndexOf Method %%%");
        System.out.println("");
    }


    public void remainingStrings(String str1, String str2) {
        //length
        System.out.println("Length of str1 = " + str1.length());

        //concat
        System.out.println("Concat to str1 = '"+str1.concat(" Concatenated Text'"));

        //contains
        System.out.println("Contains 'Kel' in str1 = "+str1.contains("Kel"));

        //startsWith
        System.out.println("Starts with 'Ke' in str1 = "+str1.startsWith("Ke"));

        //endsWith
        System.out.println("Ends with 'ly' in str1 = "+str1.endsWith("ly"));

        //equals
        System.out.println("str 1 Equals To 'Hello Kello' = "+str1.equals("Hello Kello"));

        //isEmpty
      //  System.out.println(str1.isEmpty());

        //replace
        System.out.println("Replace 'Kelly' with 'Knochenmus' in str1 = '"+str1.replace("Kelly","Knochenmus'"));

        //substring
        System.out.println("Substring of index 2 - 7 in str1 = '"+str1.substring(2,7)+"'");

        //toCharArray
        char[] charArray = str1.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            System.out.println("Index of Array = "+i+" value is '"+charArray[i]+"'");
        }

        //toLowerCase
        System.out.println("String 1 to Lower Case = '"+str1.toLowerCase()+"'");

        //toUpperCase
        System.out.println("String 1 to Upper Case = '"+str1.toUpperCase()+"'");

        //trim
        System.out.println("Trimmed str2 Value = '"+str2.trim()+"'");

        System.out.println("%%% End of remainingStrings Method %%%");
        System.out.println("");
    }
}
