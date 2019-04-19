import java.util.Scanner;

public class reverseWordsUsingSplit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(" ");

    String result="";
    for (int i = words.length-1; i >= 0; i--) 
      result = result + words[i] + " ";
    
      System.out.println(result.trim());
  }
}

// split() returns an array of strings after splitting an input String based on the delimiting regular expression.
// trim() method eliminates leading and trailing spaces.

// search for reverse words without using split()