package Datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAlphabets {
    public static void main(String[] args) {
        String s = "California continued to grow rapidly and soon became agricultural and industrial power";
        String reverse = reverseAlphabets(s);
        System.out.println(reverse);
    }

    public static String reverseAlphabets(String s) {
       
        String[] words = s.split(" ");
               
        List<String> reversedWords = Arrays.stream(words)
                                           .map(ReverseAlphabets::reverseString)
                                           .collect(Collectors.toList());
              
        return String.join(" ", reversedWords);
    }

    private static String reverseString(String word) {
        List<Character> characters = word.chars()
                                         .mapToObj(c -> (char) c)
                                         .collect(Collectors.toList());
        Collections.reverse(characters);
        StringBuilder reversedWord = new StringBuilder(characters.size());
        for (char c : characters) {
            reversedWord.append(c);
        }
        return reversedWord.toString();
    }
}
