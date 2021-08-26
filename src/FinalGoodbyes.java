import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class FinalGoodbyes extends HangManRound3 {

    public static void JamesAndAvaFarewell() throws InterruptedException {
        if (avasPoint > jamesPoint){
            System.out.println("Ava: Clearly I am the superior sibling thanks for helping me clarify that friend");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Yeah yeah yeah good game I guess.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Anyway, I think its about that time. Our motherboard is expecting us home soon.");
            TimeUnit.SECONDS.sleep(2);
        }

        if (jamesPoint > avasPoint){
            System.out.println("James: This really wasn't a shock. But thanks friend for helping me prove to Ava Im better.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ava: Yeah, yeah, yeah, beginners luck");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Anyway, our motherboard I think is calling us home.");
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("James: I just want to say that even though all we did was play games together this was really fun.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Agreed, we learned so much on what it means to interact with humans.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Java: If you ever want to play with us again please download us from our creators GitHub.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Until then so long friend.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: So long.");
    }
}
