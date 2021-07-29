import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesIntro {
    final static Scanner sc = new Scanner(System.in);

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

    static void birthdayIntro() throws InterruptedException {
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
        }
    }
}
