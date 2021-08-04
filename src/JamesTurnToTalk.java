import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesTurnToTalk {
    final static Scanner sc = new Scanner(System.in);
    static void greetAfterAva() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Hey, welcome back!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Hopefully my sister didn't bore you that much.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Haha Im just kidding. We love to as you humans say, give each other bowl movements");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Or at least thats what I've been told. Anyway Im glad you're back now.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Just in case you forgot, my name is James");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: I'm a little slow memorizing you and your human counterparts names.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Can you remind me of your name please.");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("James")){
            System.out.println("Me too!");
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("James: I haven't really met a lot of " + userName + "'s");
        TimeUnit.SECONDS.sleep(3);
    }

    static void birthdayIntro() throws InterruptedException, IOException {
        System.out.println("James: Im a Gemini. I have no idea if you care about that kind of thing. Do you?");
        System.out.print("> ");
        String yesOrNo = sc.next();
        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")) {
            System.out.println("James: Yeah me too! Haha I know people think its dumb but I find it interesting.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Its something actually that my sister and I both have in common.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: So my birthday is 05/27/1994");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Do you mind if I ask you what your birthday is?");
            System.out.print("> ");
            //Think of conditional in case they say yes.
            TimeUnit.SECONDS.sleep(2);
            String answer = sc.next();

            if (answer.equals("No") || answer.equals("no")) {
                System.out.println("James: Cool I was hoping you wouldn't mind.");
                JamesBirthdayQA.monthOfBirth();
                JamesBirthdayQA.dayOfBirth();
                JamesBirthdayQA.yearOfBirth();
                JamesZodiac.zodiacSign();
            }
        } else if (yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("Not really")){
            System.out.println("James: That's more than okay.");
            System.out.println("James: I do insist on us though playing a quick game of Tic Tac Toe");
            System.out.println("James: I am so sick of playing my sister. I need new competition.");
            JamesGame.gameIntro();
            JamesGame.gamePlay();
            TournamentIntro.allComeTogetherGreetings();
        }
    }
}

