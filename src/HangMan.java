import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HangMan {

    private static void actualGame() throws FileNotFoundException {
        final Scanner scanner = new Scanner(System.in);

        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);

        int numberIncorrect = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to go first?");
        String players = keyboard.nextLine();

        if (players.equals("Yes") || players.equals("yes")){
            System.out.println("Great lets get started!");
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        actualGame();

    }

    private static void hangingOut(int numberIncorrect){
        System.out.println("|----_----");
        System.out.println("|    |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|__________");

        if (numberIncorrect >= 1){
            System.out.println("()");
        }

        if (numberIncorrect >=2){
            System.out.println();
        }
    }

}

