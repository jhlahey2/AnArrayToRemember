package com.lahey;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String [] wordArray = new String[5];
        Scanner keyboard = new Scanner(System.in);
        String sInput = "";
        int iWordCount = 0;

        //Part 1
        System.out.println("Part 1, please enter 5 words one at a time.");

        for(int i =  0 ; i < wordArray.length ; i++)
        {
            System.out.println("Enter a word");
            sInput = keyboard.next();
            keyboard.nextLine();
            wordArray[i] = sInput;
        }// end //end for(int i =  0 ; i < wordArray.length ; i++)

        System.out.println("\nWords in the array:");
        for(int i =  0 ; i < 5 ; i++)
        {
            System.out.println(wordArray[i]);
        }//end for(int i =  0 ; i < 5 ; i++)

        //Part 2
        wordArray = new String[100];
        iWordCount = 0;
        System.out.println("\nPart 2, now type as many words as you like.  Type \"history\" to display the words and quit");
    do {
        System.out.println("Enter a word");
        sInput = keyboard.next();
        keyboard.nextLine();
        wordArray[iWordCount] = sInput;
        iWordCount++;
        if (sInput.equalsIgnoreCase("history"))
        {
            System.out.println("The history of words entered is: ");
            for(int j = 0 ; j < iWordCount ; j++)
            {
                System.out.println(wordArray[j]);
            }
        }

    }while( (iWordCount < wordArray.length ) && (!sInput.equalsIgnoreCase("history")));

    }//end public static void main(String [] args)

}//end public static void main(String[] args)
