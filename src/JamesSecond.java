import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesSecond {
    final static Scanner sc = new Scanner(System.in);
    static void greetAfterAva() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Hey, welcome back!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Hopefully my sister didn't bore you that much.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Haha Im just kidding. We love to as you humans say, give each other bowl movements ;)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Or at least that's what I've been told. Anyway Im glad you're back now.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Just in case you forgot, my name is James.");
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
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Actually on second thought I know Ava kind of asked you about that already.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Its up to you if you want to be pestered by me with those questions. She could give me that data later.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("If you guys discussed it.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Just simply type yes or no if you want to talk about it.");
        System.out.print("> ");
        String yesOrNo = sc.next();
        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")) {
            System.out.println("Awesome sauce! I was hoping you were going to say that.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: So my birthday is 05/27/1994");
            TimeUnit.SECONDS.sleep(2);;
            JamesSecondYesToZodiacSign.monthOfBirth();
            JamesSecondYesToZodiacSign.dayOfBirth();
            JamesSecondYesToZodiacSign.yearOfBirth();
            JamesZodiacSecond.zodiacSign();
            JamesSecondGame.gameIntro();
            JamesSecondGame.gamePlay();
            TournamentIntro.allComeTogetherGreetings();
        } else if (yesOrNo.equals("No") || yesOrNo.equals("no")){
            System.out.println("Hey no worries man. I do insist however that we play a game.");
            TimeUnit.SECONDS.sleep(2);
            JamesSecondGame.gameIntro();
            JamesSecondGame.gamePlay();
            TournamentIntro.allComeTogetherGreetings();
        }
    }
}
