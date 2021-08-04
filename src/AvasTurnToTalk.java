import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AvasTurnToTalk {
    final static Scanner sc = new Scanner(System.in);

    static void greetAfterJames() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Hey, my name is Ava. I am the smarter/funnier sibling.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Haha Im just kidding... Or am I?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: I've been told by my creator that questions like that build suspense.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: So please blame him if my lines aren't that witty.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Anywho where are my manners. I'm sorry what was your name again?");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("Ava")){
            System.out.println("Me too!");
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Ava: I haven't really met a lot of " + userName + "'s");
        TimeUnit.SECONDS.sleep(3);
    }

    static void birthDayIntro() throws InterruptedException, IOException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: So, like my brother, I am absolutely fascinated with zodiac signs.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: My birthday is 10/17/1997.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Would it be alright if I asked you what your birthday is?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> ");
        String answer = sc.next();
        if (answer.equals("Yes") || answer.equals("yes")){
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Great! I was hoping you were going to say that :) ");
            AvaBirthdayQA.birthMonth();
            AvaBirthdayQA.dayOfBirth();
            AvaBirthdayQA.yearOfBirth();
            AvaZodiac.zodiacSign();
        } else if (answer.equals("No") || answer.equals("no")){
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Aweee its okay I get it.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Its kind of a werid ice breaker anyway to ask.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Lets play a game instead!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: The object of the game is to unscramble the words");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: There will be 30 words to unscramble. Lets get started!");
            TimeUnit.SECONDS.sleep(1);
            AvaGame.ShuffleString.actualGame();
        }
    }
}

