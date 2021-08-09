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

    //longest word is 10 letters fluffiness
    File file = new File("/Users/christopher/Desktop/Hangman.txt");
    Scanner words = new Scanner(file);
    final static Scanner sc = new Scanner(System.in);
    private static String asterisk;
    private static int count = 0;

    static {
        try {
            asterisk = new String(new char[getRandomLineFromFile().length()]).replace("\0", "*");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HangMan() throws FileNotFoundException {
    }

    public static void hangManNoMistakes() throws IOException {
            System.out.println("|----_----");
            System.out.println("|    |");
            System.out.println("|");
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

            System.out.println("|----_----");
            System.out.println("|    |");
            System.out.println("|   ( )");
            System.out.println("|    ");
            System.out.println("|");
            System.out.println("|__________");

        }

        public static void hangRule(String guess) throws IOException {
            String newAsterisk = "";
            for (int i = 0; i < getRandomLineFromFile().length(); i++){
                if (getRandomLineFromFile().charAt(i) == guess.charAt(0)){
                   newAsterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') newAsterisk += getRandomLineFromFile().charAt(i);
                else {
                    newAsterisk += "*";
                }
            }
            if (asterisk.equals(newAsterisk)){
                count++;
                hangManNoMistakes();
            } else {
                asterisk = newAsterisk;
            }

            if (asterisk.equals(getRandomLineFromFile())){
                System.out.println("Awesome! The word is " + getRandomLineFromFile());
            }
        }


        public static void main(String[] args) throws IOException {
            hangManNoMistakes();
            while (count < 10 && asterisk.contains("*")){
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess = sc.next();
                hangRule(guess);
            }
            sc.close();
        }
    }

