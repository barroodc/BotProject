import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//Have the user guess then ava then james
//Or have james ava then user
//Or have ava james then user
//Tally the points at the end.
//Bots wont guess but the user can

public class HangMan {
    static boolean running = true;
    static Scanner s = new Scanner(System.in);
    static char[] lettersFromWord;
    static String letter;
    static int numberIncorrect = 0;
    static int avasPoint = 0;
    static int jamesPoint = 0;

    public static void introToHangman() throws IOException, InterruptedException {

        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ava: As a surprise and a thank you for hanging out with us today we have something for you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: We created a whole entire hangman game.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: James and I put our circuit boards together and came up with a list of words.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: It is with a twist though.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Ava and I are going to have some fun as well.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: We made a little wadger with each other.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: If you guess one of our words then either Ava or I will get a point");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: It all depends on whose word it is");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: If I win I get to say Im better than Ava in everything.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: And when I win I am going to say the same thing.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Enough talk. Lets play");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Agreed");
        userGoesFirst();
    }



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



    public static void userGoesFirst() throws IOException, InterruptedException {
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
                System.exit(0);
            }
        }
    }


     public static void main(String[] args) throws IOException, InterruptedException {
        introToHangman();
     }
    }






