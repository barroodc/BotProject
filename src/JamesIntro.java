import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesIntro {
    final static Scanner sc = new Scanner(System.in);

    static void greetAfterAva() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Hey, welcome back!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Hopefully my sister didn't bore you that much.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Haha Im just kidding. We love to as you humans say, give each other bowl movements");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Or at least thats what I've been told. Anyway Im glad you're back now.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Just in case you forgot, my name is James");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I'm a little slow memorizing you and your human counterparts names.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Can you remind me of your name please.");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("James")){
            System.out.println("Me too!");
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I haven't really met a lot of " + userName + "'s");
        TimeUnit.SECONDS.sleep(3);
    }

    static void greet() throws InterruptedException {
        System.out.println("I know this is awkward. Who wants to talk to their computer right?");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Anyway again my name is James");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Whats yours?");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("James")) {
            System.out.println("Me too!");
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I haven't really met a lot of " + userName + "'s");
        TimeUnit.SECONDS.sleep(3);
    }

    static void birthdayIntro() throws InterruptedException, IOException {
        System.out.println("Im a Gemini. I have no idea if you care about that kind of thing. Do you?");
        System.out.print("> ");
        String yesOrNo = sc.next();
        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")) {
            System.out.println("Yeah me too! Haha I know people think its dumb but I find it interesting.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Its something actually that my sister and I both have in common.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("So my birthday is 05/27/1994");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Do you mind if I ask you what your birthday is?");
            System.out.print("> ");
            //Think of conditional in case they say yes.
            TimeUnit.SECONDS.sleep(2);
            String answer = sc.next();

            if (answer.equals("No") || answer.equals("no")) {
                System.out.println("Cool I was hoping you wouldn't mind.");
                JamesBirthdayQA.monthOfBirth();
                JamesBirthdayQA.dayOfBirth();
                JamesBirthdayQA.yearOfBirth();
                JamesZodiac.zodiacSign();
            }
            } else if (yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("Not really")){
                   System.out.println("Thats more than okay.");
                   System.out.println("I do insist on us though playing a quick game of Tic Tac Toe");
                   System.out.println("I am so sick of playing my sister. I need new competition.");
                   JamesGame.gameIntro();
                   JamesGame.gamePlay();
                   JamesGame.letsTalkToAva();
              }
        }
    }

