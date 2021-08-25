import java.io.File;
import java.io.IOException;
import java.util.*;

public class HangManRound3 {
    static boolean running = true;
    static Scanner s = new Scanner(System.in);
    static char[] lettersFromWord;
    static String letter;
    static int numberIncorrect = 0;
    static int avasPoint = 0;
    static int jamesPoint = 0;

    public static void numberIncorrect() {
        if (numberIncorrect == 1) {
            HangManStructure.oneIncorrectAnswer();
        } else if (numberIncorrect == 2) {
            HangManStructure.twoIncorrectAnswers();
        } else if (numberIncorrect == 3) {
            HangManStructure.threeIncorrectAnswers();
        } else if (numberIncorrect == 4) {
            HangManStructure.fourIncorrectAnswers();
        } else if (numberIncorrect == 5) {
            HangManStructure.fiveIncorrectAnswers();
        } else if (numberIncorrect == 6) {
            HangManStructure.sixIncorrectAnswers();
        }
    }

    public static void hangmanRound3() throws IOException, InterruptedException {
        System.out.println("ROUND 3");
        System.out.println();
        Scanner scanner = new Scanner(new File("/Users/christopher/Desktop/Hangman.txt"));
        Scanner scanner2 = new Scanner(new File("/Users/christopher/Desktop/JamesWords.txt"));
        Scanner scanner3 = new Scanner(new File("/Users/christopher/Desktop/AvasWords.txt"));

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

            //need to create ava and james objects here

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

            for (int i = 0; i < word.length(); i++){
                if (Arrays.equals(lettersFromWord, word.toCharArray())){
                    System.out.println("You won!");

                    while (scanner2.hasNext()){
                        String line = scanner2.nextLine();
                        if (line.contains(word)){
                            System.out.println("James: In your face Ava!");
                            jamesPoint++;
                        }
                    }

                    while (scanner3.hasNext()){
                        String line = scanner3.nextLine();
                        if (line.contains(word)){
                            System.out.println("Ava: Hahaha one more to go.");
                            avasPoint++;
                        }
                    }

                    System.exit(0);
                }
            }

            if (numberIncorrect == 6){
                System.out.println("GAME OVER");
                System.out.println("The word was: " + word);

                while (scanner2.hasNext()){
                    String line = scanner2.nextLine();
                    if (line.contains(word)){
                        System.out.println("James: In your face Ava!");
                        jamesPoint++;
                    }
                }

                while (scanner3.hasNext()){
                    String line = scanner3.nextLine();
                    if (line.contains(word)){
                        System.out.println("Ava: Hahaha one more to go.");
                        avasPoint++;
                    }
                }

                if (jamesPoint > avasPoint){
                    System.out.println("James: I win");
                }

                if (avasPoint > jamesPoint){
                    System.out.println("Ava: I win");
                }

                if (avasPoint == jamesPoint){
                    System.out.println("Dam, it looks like we have to play rock,paper, scissor to handle this.");
                    JamesTiesAva.rockPaperScissorShoot();
                }
                System.exit(0);
            }
        }
    }
}
