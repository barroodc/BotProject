import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

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
        System.out.println("Agreed");

        System.out.println("Ava: Would you like to go first?");
        System.out.print("> ");
        String players = keyboard.nextLine();

        if (players.equals("Yes") || players.equals("yes")) {
            System.out.println("Ava: Great lets get started!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Make sure to enter in only lowercase letters please");
            userGoesFirst();
            System.exit(0);
        } else if (players.equals("No") || players.equals("no")) {
            System.out.println("James: I guess Ava and I will have to rock paper scissor shoot over it.");
        }

        System.out.println("James: Ready Ava?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Always :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Awesome. Here we go!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Rock");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Paper");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Scissor");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Shoot");
        TimeUnit.SECONDS.sleep(2);

        rockPaperScissorShoot();
    }

    private static void rockPaperScissorShoot() throws InterruptedException, IOException {
        Random rand = new Random();
        String[] rockPaperScissor = {"Rock", "Paper", "Scissor"};
        String a = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];
        String b = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];

        String james = "James: " + a;
        String ava = "Ava: " + b;

        System.out.println(james);
        System.out.println(ava);

        boolean valid = false;

        while (!valid) {

            if (james.contains("Rock") && ava.contains("Scissor")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Alright my human counterpart lets play!");
                valid = true;
            } else if (james.contains("Scissor") && ava.contains("Paper")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                valid = true;
            } else if (james.contains("Paper") && ava.contains("Rock")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                valid = true;
            } else if (ava.contains("Rock") && james.contains("Scissor")) {
                //Consider adding images to Rock Paper Scissors.
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                valid = true;
            } else if (ava.contains("Scissor") && james.contains("Paper")) {
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                valid = true;
            } else if (ava.contains("Paper") && james.contains("Rock")) {
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                valid = true;
            } else {
                System.out.println("James: Dam it was a tie. Lets try again.");
                rockPaperScissorShoot();
                break;
            }
        }
    }

    public static int randomNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
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
                System.exit(0);
            }
        }
    }

     public static void main(String[] args) throws IOException, InterruptedException {
        introToHangman();
     }
    }




