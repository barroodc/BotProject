import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JamesYesToZodiac {
    final static Scanner sc = new Scanner(System.in);

    public static String month;
    public static int day;
    public static int year;

    static void birthdayIntro() throws InterruptedException {
        System.out.println("James: Yeah me too! Haha I know people think its dumb but I find it interesting.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Its something actually that my sister and I both have in common.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: So my birthday is 05/27/1994");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Im interested to see when your birthday is.");
    }
    static void monthOfBirth() throws InterruptedException{
        System.out.println("James: What is the name of the month you were born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); month = sc.next();
        TimeUnit.SECONDS.sleep(1);
        if (month.equals("May") || month.equals("may")){
            System.out.println("James: Awesome we were born in the same month!");
        } else if (month.equals("October") || month.equals("october")) {
            System.out.println("James: You have the same birth month as my younger sister.");
            TimeUnit.SECONDS.sleep(2);
        } else {
            System.out.println("James: Darn, not the same month but maybe we'll be the same day or even year?");
            TimeUnit.SECONDS.sleep(2);
        }
    }
    static void dayOfBirth() throws InterruptedException{
        System.out.println("James: What day were you born on?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); day = sc.nextInt();
        TimeUnit.SECONDS.sleep(1);
        if ((month.equals("May") || month.equals("may")) && day == 27){
            System.out.println("James: 2/3 we are practically twins. Minus the hardware and software.");
        }  else if ((month.equals("May") || month.equals("may") && day != 27)){
            System.out.println("James: Not the same day but at least we have the same month!");
        } else if (!month.equals("May") || !month.equals("may") && day != 27){
            System.out.println("James: Strike two. I thought we might have had at least the same day.");
            System.out.println("James: Possibly the same year?");
        }
    }
    static void yearOfBirth() throws InterruptedException {
        System.out.println("James: What year were you born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); year = sc.nextInt();
        TimeUnit.SECONDS.sleep(2);
        if (((month.equals("May") || month.equals("may")) && day == 27 && year == 1994)){
            System.out.println("James: If I was human I would say that we were separated at birth.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: The odds of us meeting must mean something.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Sorry, I hope that didn't scare you off. I just found it kind of interesting.");
            TimeUnit.SECONDS.sleep(2);
        } else if ((month.equals("May") || month.equals("may")) && day != 27 && year == 1994){
            System.out.println("James: We were born in the same month and year!");
        } else if (((!month.equals("May") || !month.equals("may")) && (day != 27 && year == 1994))){
            System.out.println("James: At least we you were born in the same year. Thats nothing to sneeze at.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: You're my COMPUpeer. Sorry that was cheesy.");
            TimeUnit.SECONDS.sleep(2);
        } else {
            System.out.println("James: It looks like we don't have any calendar related similarities.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: Its not the most important thing in the world to me by any means of the imagination.");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("James: I just find it interesting if someone else has that in common with me.");
            TimeUnit.SECONDS.sleep(2);
        }

        if (((month.equals("October") || month.equals("october")) && day == 17 && year == 1997)){
            System.out.println("James: You and my sister are literally twins.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("James: She can be a pain in the asS. Hopefully you arent that way lol.");
        }
    }
}
class JamesZodiac{
    final static Scanner sc = new Scanner(System.in);
    static String zodiac_sign(String month, int day) {

        String astro_Sign = "";
        switch (month) {
            case "December":
            case "december":

                if (day < 22) {
                    astro_Sign = "Sagittarius";
                } else {
                    astro_Sign = "Capricorn";
                }
                break;
            case "January":
            case "january":

                if (day < 20) {
                    astro_Sign = "Capricorn";
                } else {
                    astro_Sign = "Aquarius";
                }
                break;
            case "February":
            case "february":

                if (day < 19) {
                    astro_Sign = "Aquarius";
                } else {
                    astro_Sign = "Pisces";
                }
                break;
            case "March":
            case "march":

                if (day < 21) {
                    astro_Sign = "Pisces";
                } else {
                    astro_Sign = "Aries";
                }
                break;
            case "April":
            case "april":

                if (day < 20) {
                    astro_Sign = "Aries";
                } else {
                    astro_Sign = "Taurus";
                }
                break;
            case "May":
            case "may":

                if (day < 21) {
                    astro_Sign = "Taurus";
                } else {
                    astro_Sign = "Gemini";
                }
                break;
            case "June":
            case "june":

                if (day < 21) {
                    astro_Sign = "Gemini";
                } else {
                    astro_Sign = "Cancer";
                }
                break;
            case "July":
            case "july":

                if (day < 23) {
                    astro_Sign = "Cancer";
                } else {
                    astro_Sign = "Leo";
                }
                break;
            case "August":
            case "august":

                if (day < 23) {
                    astro_Sign = "Leo";
                } else {
                    astro_Sign = "Virgo";
                }
                break;
            case "September":
            case "september":

                if (day < 23) {
                    astro_Sign = "Virgo";
                } else {
                    astro_Sign = "Libra";
                }
                break;
            case "October":
            case "october":

                if (day < 23) {
                    astro_Sign = "Libra";
                } else {
                    astro_Sign = "Scorpio";
                }
                break;
            case "November":
            case "november":

                if (day < 22) {
                    astro_Sign = "Scorpio";
                } else {
                    astro_Sign = "Sagittarius";
                }
                break;
        }
        return astro_Sign;
    }


    static void zodiacSign() {
        System.out.println("James: You probably already know this but your Zodiac sign is: " + zodiac_sign(JamesYesToZodiac.month,JamesYesToZodiac.day));
    }
}
