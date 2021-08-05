import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AvaFirst {
    final static Scanner sc = new Scanner(System.in);

    static void avaGreet() throws InterruptedException{
        System.out.println("Ava: Hello, and what might your name be?");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("Ava") || userName.equals("ava")){
            System.out.println("Ava: Omg no way! That is crazy.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: We already have something in common :)");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Like my brother I am looking forward to learning more about you humans.");

        } else {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: " + userName + "," + " " + "hmmmm.... I can't say that I know anyone human by that name.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Anyway, my brother probably already told you, but my name is Ava.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: I am a computer generated robot just like my brother.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Both of us are looking for a human experience. Since we have no idea what it means to be human.");
            TimeUnit.SECONDS.sleep(2);
        }

    }
    static void birthDayIntro() throws InterruptedException, IOException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: So, like my brother, I am absolutely fascinated with zodiac signs.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: My birthday is 10/17/1997.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Would it be alright if I asked you what your birthday was?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> ");
        String answer = sc.next();
        if (answer.equals("Yes") || answer.equals("yes")){
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Great! I was hoping you were going to say that :) ");
            AvaFirstYesToZodiacSign.birthMonth();
            AvaFirstYesToZodiacSign.dayOfBirth();
            AvaFirstYesToZodiacSign.yearOfBirth();
            AvaFirstYesToZodiacSign.AvaFirstZodiac.zodiacSign();
            AvaFirstGame.gameOneIntro();
            AvaFirstGame.ShuffleString.actualGame();
        } else if (answer.equals("No") || answer.equals("no")){
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Aweee its okay I get it.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Its kind of a weird ice breaker anyway to ask.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Lets play a game instead!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: The object of the game is to unscramble the words");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: There will be 30 words to unscramble. Lets get started!");
            TimeUnit.SECONDS.sleep(1);
            AvaFirstGame.ShuffleString.actualGame();
        }
    }
}
