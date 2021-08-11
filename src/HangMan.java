import java.io.File;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Have the user guess then ava then james
//Or have james ava then user
//Or have ava james then user
//Tally the points at the end.
//Bots wont guess but the user can

public class HangMan {


    private static void introToHangman() throws IOException, InterruptedException {

        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to go first?");
        String players = keyboard.nextLine();

        if (players.equals("Yes") || players.equals("yes")){
            System.out.println("Great lets get started!");
            userGoesFirst();
            System.exit(0);
        } else{
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

    private static void rockPaperScissorShoot() throws InterruptedException {
        Random rand = new Random();
        String[] rockPaperScissor = {"Rock", "Paper", "Scissor"};
        String a = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];
        String b = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];

        String james = "James: " + a;
        String ava = "Ava: " + b;

        System.out.println(james);
        System.out.println(ava);

        boolean valid = false;
        int jamesWonRPS = 0;
        int avaWonRPS = 0;

        while (!valid) {

            if (james.contains("Rock") && ava.contains("Scissor")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Alright my human counterpart lets play!");
                ++jamesWonRPS;
                valid = true;
            } else if (james.contains("Scissor") && ava.contains("Paper")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                ++jamesWonRPS;
                valid = true;
            } else if (james.contains("Paper") && ava.contains("Rock")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                ++jamesWonRPS;
                valid = true;
            } else if (ava.contains("Rock") && james.contains("Scissor")){
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                ++avaWonRPS;
                valid = true;
            } else if (ava.contains("Scissor") && james.contains("Paper")){
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                ++avaWonRPS;
                valid = true;
            } else if (ava.contains("Paper") && james.contains("Rock")){
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                ++avaWonRPS;
                valid = true;
            } else {
                System.out.println("James: Dam it was a tie. Lets try again.");
                rockPaperScissorShoot();
                break;
            }
        }
    }


    public static void userGoesFirst() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(new File("/Users/christopher/Desktop/Hangman.txt"));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        String asterisk = new String(new char[words.size()]).replace("\0", "*");
        int numberIncorrect = 0;

        HangManStructure.beginningStructure();

        System.out.println("Please guess a letter");
        Scanner keyboard = new Scanner(System.in);
        String letterGuess = keyboard.nextLine();

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }
        if (numberIncorrect == 1){
           HangManStructure.oneIncorrectAnswer();
        }

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }
        if (numberIncorrect == 2){
            HangManStructure.twoIncorrectAnswers();
        }

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }
        if (numberIncorrect == 3){
            HangManStructure.threeIncorrectAnswers();
        }

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }

        if (numberIncorrect == 4){
            HangManStructure.fourIncorrectAnswers();
        }

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }
        if (numberIncorrect == 5){
            HangManStructure.fiveIncorrectAnswers();
        }

        if (!words.contains(letterGuess)){
            ++numberIncorrect;
        }
        if(numberIncorrect == 6){
            HangManStructure.sixIncorrectAnswers();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException{
        introToHangman();
    }
}

