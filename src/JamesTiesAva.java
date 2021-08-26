import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class JamesTiesAva {
    public static void rockPaperScissorShoot() throws InterruptedException, IOException {

        System.out.println("Rock");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Paper");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Scissor");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Shoot");
        TimeUnit.SECONDS.sleep(2);
        Random rand = new Random();
        String[] rockPaperScissor = {"Rock", "Paper", "Scissor"};
        String a = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];
        String b = rockPaperScissor[rand.nextInt(rockPaperScissor.length)];

        String james = "James: " + a;
        String ava = "Ava: " + b;

        System.out.println(james);
        System.out.println(ava);

        boolean valid = false;

        while (!valid) {

            if (james.contains("Rock") && ava.contains("Scissor")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else if (james.contains("Scissor") && ava.contains("Paper")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else if (james.contains("Paper") && ava.contains("Rock")) {
                System.out.println("James: Yayyyy looks like I win!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Dam I guess you do");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else if (ava.contains("Rock") && james.contains("Scissor")) {
                //Consider adding images to Rock Paper Scissors.
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else if (ava.contains("Scissor") && james.contains("Paper")) {
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else if (ava.contains("Paper") && james.contains("Rock")) {
                System.out.println("Ava: Haha I knew I'd win. Not a shock really to be honest hehe :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("James: Yeah yeah yeah good game. You won fair and square.");
                valid = true;
                FinalGoodbyes.JamesAndAvaFarewell();
            } else {
                System.out.println("James: Dam it was a tie. Lets try again.");
                rockPaperScissorShoot();
                break;
            }
        }
    }
}
