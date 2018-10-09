package com.lahey;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String [] wordArray = new String[5];
        String [] presidents = {"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};
        Scanner keyboard = new Scanner(System.in);

        for(int i =  0 ; i < wordArray.length ; i++)
        {
            System.out.println("Enter a word");
            String s = keyboard.next();
            keyboard.nextLine();
            wordArray[i] = s;
            if (s.equalsIgnoreCase("history"))
            {
                for(int j = 0 ; j < presidents.length ; j++)
                {
                    System.out.println(presidents[j]);
                }
            }
        }// end //end for(int i =  0 ; i < wordArray.length ; i++)

        System.out.println("Words in Array:");
        for(int i =  0 ; i < 5 ; i++)
        {
            System.out.println(wordArray[i]);
        }//end for(int i =  0 ; i < 5 ; i++)

    }//end public static void main(String [] args)

}//end public static void main(String[] args)
