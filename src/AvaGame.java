import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AvaGame {
    final static Scanner sc = new Scanner(System.in);
    //word unscramble
    static void gameOneIntro(){
        System.out.println("Hmmmm... so we talked about our Zodiac signs");
        System.out.println("OOO OOooo oo ha forgive my excitement but would you want to play a game with me? :)");
        System.out.println("If not its okay we can always do something else.");
        System.out.print(">");
        String answerOne = sc.next();

        if (answerOne.contains("Yes") || answerOne.contains("yes")){
            System.out.println("Yay okay so... the game I want to play with you is one of my favorites");
        } else if(answerOne.contains("No") || answerOne.contains("no")){
            System.out.println("That's okay we can do something else!");
        }

        System.out.println("Just a quick reminder of how to play");
        System.out.println("There will be a total of 30 different words on the screen.");
        System.out.println("Each one of us has 10 seconds to unscramble the six letters shown on the screen");

        System.out.println("Ready to start?");
        System.out.print("> ");
        String answerTwo = sc.next();

        System.out.println("Great! lets begin.");
    }
    //add a counter
}
