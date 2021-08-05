import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesFirst {
    final static Scanner sc = new Scanner(System.in);

    static void greetJames() throws InterruptedException {
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
            JamesYesToZodiac.birthdayIntro();
            JamesYesToZodiac.monthOfBirth();
            JamesYesToZodiac.dayOfBirth();
            JamesYesToZodiac.yearOfBirth();
            JamesZodiac.zodiacSign();
            JamesFirstGame.gameIntro();
            JamesFirstGame.gamePlay();
            JamesFirstGame.letsTalkToAva();
            AvaSecond.avaGreet();
            AvaSecond.birthDayIntro();
        } else if (yesOrNo.equals("No") || yesOrNo.equals("no")){
            System.out.println("James: That's more than okay.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: I do insist on us though playing a quick game of Tic Tac Toe");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: I am so sick of playing my sister. I need new competition.");
            TimeUnit.SECONDS.sleep(2);
            JamesFirstGame.gameIntro();
            JamesFirstGame.gamePlay();
            JamesFirstGame.letsTalkToAva();
            AvaSecond.avaGreet();
            AvaSecond.birthDayIntro();

        }
    }
}
