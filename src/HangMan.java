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

    final static Scanner sc = new Scanner(System.in);

        public static void hangManNoMistakes() throws IOException {
            System.out.println("|----_----");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|__________");

            System.out.println("Your guess: ");
            File file = new File("/Users/christopher/Desktop/Hangman.txt");
            Scanner scan = new Scanner(file);
        }

    public static String getRandomLineFromFile() throws IOException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        final RandomAccessFile f = new RandomAccessFile(file, "r");
        final long randomLocation = (long) (Math.random() * f.length());
        f.seek(randomLocation);
        f.readLine();
        String randomLine = f.readLine();
        f.close();
        return randomLine;
        }

        public static void hangManOneMistake() {

            String top = ("|----_----");
            String nooseLink1 = ("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|__________");

        }


        public static void main(String[] args) throws IOException {
            hangManNoMistakes();
            System.out.println(getRandomLineFromFile());
        }
    }

