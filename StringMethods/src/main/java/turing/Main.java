package turing;

import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Length
        String word = "Hello World ";
        System.out.println("____________________");
        System.out.println("Length: " + word.length());

        //char At
        System.out.println("____________________");
        System.out.println("Char At[0]: "+word.charAt(0));

        //Substring
        System.out.println("____________________");
        System.out.println("Substring: "+word.substring(3));

        //Equals
        System.out.println("____________________");
        System.out.println("Equals:(Hello World)--> " + word.equals("Hello World"));

        //compareTo
        System.out.println("____________________");
        System.out.println("CompareTo: " + word.compareTo("Salam Dunya"));
        System.out.println("CompareTo IngoreCase: " + word.compareToIgnoreCase("Dunya Salam"));

        //contains
        System.out.println("____________________");
        System.out.println("Contains: " + word.contains("Hell"));

        //startsWith
        System.out.println("____________________");
        System.out.println("StartsWith: " + word.startsWith("E"));

        //EndsWith
        System.out.println("____________________");
        System.out.println("EndsWith: " + word.endsWith(" "));

        //indexOf
        System.out.println("____________________");
        System.out.println("IndexOf: " + word.indexOf("l"));

        //lastIndexOf
        System.out.println("____________________");
        System.out.println("lastIndexOf: " + word.lastIndexOf("l"));

        //isEmpty
        System.out.println("____________________");
        System.out.println("IsEmpty: " + word.isEmpty());

        //isBlank
        System.out.println("____________________");
        System.out.println("IsBlank: " + word.isBlank());

        //LowerCase
        System.out.println("____________________");
        System.out.println("LowerCase: " + word.toLowerCase());

        //UpperCase
        System.out.println("____________________");
        System.out.println("UpperCase: " + word.toUpperCase());

        //Trim
        System.out.println("____________________");
        System.out.println("Trim: " + word.trim());

        //replace
        System.out.println("____________________");
        System.out.println("Replace(o-->a): " + word.replace('o','a'));

        //ReplaceAll
        System.out.println("____________________");
        System.out.println("ReplaceAll(Hell --> Xell): " + word.replaceAll("Hell", "Xell"));

        //split
        System.out.println("____________________");
        System.out.println("Split: " + Arrays.asList( word.split("l")));

        //Join
        System.out.println("____________________");
        String[] letter = {"Hello", "World"};
        System.out.println("Join: " + String.join(" ",letter));

        //valueOf
        System.out.println("____________________");
        int a = 150;
        String b = String.valueOf(a);
        System.out.println("ValueOf: " + b);

        //Repeat:
        System.out.println("____________________");
        System.out.println("Repeat(3 times): " + word.repeat(3));

        //Formatted
        System.out.println("____________________");
        System.out.println("Format: " + String.format("Hello %s!", "World"));

    }

}