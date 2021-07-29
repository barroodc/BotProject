import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AvaIntro extends ChatBot {
final static Scanner sc = new Scanner(System.in);

    public AvaIntro(String name, String botBirthMonth, int botBirthDay, int botBirthYear) {
        super(name, botBirthMonth, botBirthDay, botBirthYear);
    }

    static void avaGreet() throws InterruptedException{
    System.out.println("Hello, and what might your name be?");
    System.out.print("> ");
    String userName = sc.next();
    if (userName.equals("Ava") || userName.equals("ava")){
        System.out.println("Omg no way! That is crazy.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("We already have something in common :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Like my brother I am looking forward to learning more about you humans.");

    } else {
        TimeUnit.SECONDS.sleep(2);
        System.out.println(userName + "," + " " + "hmmmm.... I can't say that I know anyone human by that name.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Anyway, my brother probably already told you, but my name is Ava.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I am a computer generated robot just like my brother.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Both of us are looking for a human experience. Since we have no idea what it means to be human.");
    }

}

static void birthDayIntro() throws InterruptedException{
    System.out.println("So, like my brother, I am absolutely fascinated with zodiac signs.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("My birthday is 10/17/1997.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Would it be alright if I asked you what your birthday is?");
    TimeUnit.SECONDS.sleep(2);
    System.out.print("> ");
    String answer = sc.next();
    if (answer.equals("Yes") || answer.equals("yes")){
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Great! I was hoping you were going to say that :) ");
        AvaBirthdayQA.birthMonth();
        AvaBirthdayQA.dayOfBirth();
        AvaBirthdayQA.yearOfBirth();
        AvaZodiac.zodiacSign();
    }
}
}
