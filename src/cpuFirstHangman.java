import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class cpuFirstHangman {
//cpu should guess from an algorithm that selects random letters from the alphabet.
    //These random letters will be cross referenced with the word from the list.
    static boolean running = true;
    static Scanner s = new Scanner(System.in);
    static char[] lettersFromWord;
    static String letter;
    static int numberIncorrect = 0;

    public static void avaWon() throws FileNotFoundException, InterruptedException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("Ava: Since I am the clear winner I will gladly go first");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: I wish our human friend could see me rolling my eyes at you right now");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Alright, enough talk lets play!");
    }

    public static void jamesWon() throws FileNotFoundException, InterruptedException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("James: Haha I knew I would win. In your face Ava!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Yeah yeah yeah, blah blah blah");
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

    public static void userGoesFirst() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(new File("/Users/christopher/Desktop/Hangman.txt"));

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        HangManStructure.beginningStructure();


        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));
        lettersFromWord = new char[word.length()];
        Arrays.fill(lettersFromWord, '_');


        while (running) {
            System.out.print("\nYour word is: ");
            for (int x = 0; x < lettersFromWord.length; x++) {
                if (lettersFromWord[x] == '_') {
                    System.out.print(" _");
                } else {
                    System.out.print(" " + lettersFromWord[x]);
                }
            }

            System.out.print("\nGuess a letter please: ");
            letter = s.next();

            for (int i = 0; i < word.length(); i++) {
                if (word.substring(i, i + 1).equals(letter)) {
                    lettersFromWord[i] = letter.charAt(0);
                }
            }

            for (int i = 0; i < word.length(); i++){
                if (!word.contains(letter)){
                    numberIncorrect++;
                    numberIncorrect();
                    break;
                }
            }

            if (numberIncorrect == 6){
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {

    }


}
