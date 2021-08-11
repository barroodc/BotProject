import java.io.File;

import java.io.IOException;

import java.sql.Time;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HangMan {

    private static void introToHangman() throws IOException, InterruptedException {
        final Scanner scanner = new Scanner(System.in);

        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);

        int numberIncorrect = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to go first?");
        String players = keyboard.nextLine();

        if (players.equals("Yes") || players.equals("yes")){
            System.out.println("Great lets get started!");
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

        while (!valid) {

            if (james.contains("Rock") && ava.contains("Scissor")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Alright my human counterpart lets play!");
                valid = true;
            } else if (james.contains("Scissor") && ava.contains("Paper")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                valid = true;
            } else if (james.contains("Paper") && ava.contains("Rock")){
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Alright my human counterpart lets play!");
                valid = true;
            } else if (ava.contains("Rock") && james.contains("Scissor")){
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                valid = true;
            } else if (ava.contains("Scissor") && james.contains("Paper")){
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Okay my human from another motherboard lets play some hangman!");
                valid = true;
            } else if (ava.contains("Paper") && james.contains("Rock")){
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


    public static void main(String[] args) throws IOException, InterruptedException {

        introToHangman();

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
            System.out.println("|");
        }
    }

}

