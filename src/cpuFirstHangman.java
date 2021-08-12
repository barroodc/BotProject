import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cpuFirstHangman {
//cpu should guess from an algorithm that selects random letters from the alphabet.
    //These random letters will be cross referenced with the word from the list.
    static int numberIncorrect = 0;

    public static void avaWon() throws FileNotFoundException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("testing");
    }

    public static void jamesWon() throws FileNotFoundException{
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("testing");
    }

    public static void numberIncorrect(){
        if (numberIncorrect == 1){
            HangManStructure.oneIncorrectAnswer();
        } else if (numberIncorrect == 2){
            HangManStructure.twoIncorrectAnswers();
        } else if (numberIncorrect == 3){
            HangManStructure.threeIncorrectAnswers();
        } else if (numberIncorrect == 4){
            HangManStructure.fourIncorrectAnswers();
        } else if (numberIncorrect == 5){
            HangManStructure.fiveIncorrectAnswers();
        } else if (numberIncorrect == 6){
            HangManStructure.sixIncorrectAnswers();
        }
    }


}
