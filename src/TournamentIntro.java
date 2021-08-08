import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TournamentIntro {
    final static Scanner sc = new Scanner(System.in);

    static void allComeTogetherGreetings() throws InterruptedException {
        System.out.println("James: Hey sis");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Hey bro.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Before we send our human friend here on their way did you want to play a game?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Obviously its up to our human friend here.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: What would you like to do?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Would you have time for one more game?");
        TimeUnit.SECONDS.sleep(2);

        String yesOrNo = sc.next();

        if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")){
            System.out.println("Ava: That's aweomse!");

        } else if (yesOrNo.equals("no") || yesOrNo.equals("No")){
            System.out.println("Ava: No worries at all my guy.");
        }
    }
}
