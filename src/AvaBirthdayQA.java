

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AvaBirthdayQA {

    final static Scanner sc = new Scanner(System.in);
    public static String month;
    public static int day;
    public static int year;

    static void birthMonth() throws InterruptedException{
        System.out.println("What is the name of the month you were born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); month = sc.next();
        ChatBot.month = month;
        TimeUnit.SECONDS.sleep(1);
        if (month.equals("October") || month.equals("october")){
            System.out.println("Awesome we were born in the same month!");
        } else if (month.equals("May") || month.equals("may")){
            System.out.println("That's the same month as my older brother!");
            TimeUnit.SECONDS.sleep(2);
        } else {
            System.out.println("Darn, not the same month but maybe we'll be the same day or even year?");
            TimeUnit.SECONDS.sleep(2);
        }
    }

    static void dayOfBirth() throws InterruptedException{
        System.out.println("What day were you born on?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); day = sc.nextInt();
        ChatBot.day = day;
        TimeUnit.SECONDS.sleep(1);
        if ((month.equals("October") || month.equals("october")) && day == 17){
            System.out.println("Same month and same day. I can't believe the coincidence!");
        }  else if (month.equals("May") || month.equals("may") && day == 27){
            System.out.println("You and my brother have the exact same zodiac sign!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("If you say the same year you could literally be our long lost twin.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("If you weren't human lol.");
        }  else if (day == 17) {
            System.out.println("Forget the whole same month thing. Being born on the same day is equally as cool.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("In my opinion at least.");
        } else {
            System.out.println("So, not the same month or same day huh :(");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Maybe the same year?");
        }
    }

    static void yearOfBirth() throws InterruptedException{
        System.out.println("What year were you born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); year = sc.nextInt();
        TimeUnit.SECONDS.sleep(2);
        if ((month.equals("October") || month.equals("october")) && day == 17 && year == 1997){
            System.out.println("Thats interesting. So was I. One step closer to being the same sign :) ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Lets continue to see if we are siblings from another motherboard :)");
            TimeUnit.SECONDS.sleep(2);

        } else if (month.equals("May") || month.equals("may") && day == 27 && year == 1994){
            System.out.println("That's so weird. You and my brother have the exact same birthday.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Hopefully you aren't as annoying as him.");
            TimeUnit.SECONDS.sleep(2);

        } else if (day == 17 && year == 1997){
            System.out.println("Aweeee snap. Not the same month. But at least we share the same day and year :)");
            TimeUnit.SECONDS.sleep(2);

        } else if (day != 17 && year == 1997){
            System.out.println("Well as my brother would say we are Compupeers. :)");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I know that joke was bad. Unfortunately my brother and I get our humor");
            System.out.println("from the same motherboard.");
            TimeUnit.SECONDS.sleep(2);

        } else {
            System.out.println("It looks like we don't have any calendar related similarities.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Its not the most important thing in the world to me by any means of the imagination.");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("I just find it interesting if someone else has that in common with me.");
            TimeUnit.SECONDS.sleep(2);

        }
    }

}
