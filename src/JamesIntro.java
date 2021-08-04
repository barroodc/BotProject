import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesIntro {
    final static Scanner sc = new Scanner(System.in);

    static void greet() throws InterruptedException {
        System.out.println("James: I know this is awkward. Who wants to talk to their computer right?");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("James: Anyway again my name is James");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Whats yours?");
        System.out.print("> ");
        String userName = sc.next();
        if (userName.equals("James")) {
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
                   TimeUnit.SECONDS.sleep(2);
                   System.out.println("James: I do insist on us though playing a quick game of Tic Tac Toe");
                   TimeUnit.SECONDS.sleep(2);
                   System.out.println("James: I am so sick of playing my sister. I need new competition.");
                   TimeUnit.SECONDS.sleep(2);
                       JamesGame.gameIntro();
                       JamesGame.gamePlay();
                       JamesGame.letsTalkToAva();
              }
        }
    }

