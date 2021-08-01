
import java.util.*;
import java.util.concurrent.TimeUnit;

public class JamesBirthdayQA extends ChatBot {

    /*If the user chooses Ava first I need to alter the class
    so Im not asking too many similar questions.

    Also, if user enters invalid Month
    or if user enters number outside of number of days in the calendar
    have them reenter the date.
     */

    final static Scanner sc = new Scanner(System.in);
    public static String month;
    public static int day;
    public static int year;

    public JamesBirthdayQA(String name, String botBirthMonth, int botBirthDay, int botBirthYear) {
        super(name, botBirthMonth, botBirthDay, botBirthYear);
    }

    static void monthOfBirth() throws InterruptedException{
        System.out.println("What is the name of the month you were born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); month = sc.next();
        TimeUnit.SECONDS.sleep(1);
        if (month.equals("May") || month.equals("may")){
            System.out.println("Awesome we were born in the same month!");
        } else if (month.equals("October") || month.equals("october")) {
            System.out.println("You were born in the same month as my younger sister!");
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
        TimeUnit.SECONDS.sleep(1);
        if ((month.equals("May") || month.equals("may")) && day == 27){
            System.out.println("2/3 we are practically twins. Minus the hardware and software.");
        }  else if (month.equals("October") || month.equals("october") && day == 17){
            System.out.println("You and my sister are almost twins.");
            System.out.println("I can't say the same for us though lol.");
            TimeUnit.SECONDS.sleep(2);
        }  else if (day == 27) {
            System.out.println("Lol not looking good in terms of being twins.");
            System.out.println("But being born on the same day is still something else we have in common.");
        } else {
            System.out.println("Strike two. I thought we might have had at least the same day.");
            System.out.println("Possibly the same year?");
        }
    }

    static void yearOfBirth() throws InterruptedException {
        System.out.println("What year were you born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); year = sc.nextInt();
        TimeUnit.SECONDS.sleep(2);
        if ((month.equals("May") || month.equals("may") && day == 27 && year == 1994)){
            System.out.println("If I was human I would say that we were separated at birth.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("The odds of us meeting must mean something.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Sorry, I hope that didn't scare you off. I just found it kind of interesting.");
            TimeUnit.SECONDS.sleep(2);
        } else if(month.equals("October") || month.equals("october") && day == 17 && year == 1997){
            System.out.println("You and my sister are literally twins.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("She can be a pain in the asS. Hopefully you arent that way lol.");
        } else if (day == 27 && year == 1994){
            System.out.println("Hey 2/3 isn't bad. We are practically twins. Minus that hardware and software.");
            TimeUnit.SECONDS.sleep(2);
        } else if (day != 27 && year == 1994){
            System.out.println("At least we you were born on the same year. Thats nothing to sneeze at.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You're my COMPUpeer. Sorry that was cheesy.");
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
