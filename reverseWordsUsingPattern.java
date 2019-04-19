import java.util.Scanner;
import java.util.regex.Pattern;

public class reverseWordsUsingPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // String[] words = str.split(" ");

    // Specifying the pattern to be searched 
    // Pattern pattern = Pattern.compile("\\s"); 
  
    // splitting String str with a pattern 
    // (i.e )splitting the string whenever their 
    //  is whitespace and store in temp array. 
    // String[] words = pattern.split(str); 
    String[] words = str.split("\\s+");

    String result="";
    for (int i = words.length-1; i >= 0; i--) 
      result = result + words[i] + " ";
    
      System.out.println(result.trim());
  }
}

// split() returns an array of strings after splitting an input String based on the delimiting regular expression.
// trim() method eliminates leading and trailing spaces.


// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class RegexExamples {
//     public static void main(String[]args) {
//         Pattern p = Pattern.compile("\\d+");
//         Matcher m = p.matcher("string1234more567string890");
//         while(m.find()) {
//             System.out.println(m.group());
//         }
//     }
// }

// Output:
// 1234
// 567
// 890