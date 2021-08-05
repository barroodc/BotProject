import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AvaFirstYesToZodiacSign {
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
        }  else if (month.equals("October") || month.equals("october") && day !=17 ){
            System.out.println("Not the same day but at least we were born in the same month :)");
        } else if ((!month.equals("October") || !month.equals("October")) && day != 27){
            System.out.println("Not the same month or day huh :(");
        }

        if ((month.equals("May") || month.equals("may")) && day == 27){
            System.out.println("You were born on the same day and month as my brother!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("That means you have the same zodiac sign!");
        } else if ((month.equals("May") || month.equals("may")) && day != 27){
            System.out.println("You were born in the same month as my older brother!");
        }
    }
    static void yearOfBirth() throws InterruptedException{
        System.out.println("What year were you born in?");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("> "); year = sc.nextInt();
        TimeUnit.SECONDS.sleep(2);
        if ((month.equals("October") || month.equals("october")) && day == 17 && year == 1997){
            System.out.println("Thats so cool! We are literally siblings from another motherboard. :) ");
            TimeUnit.SECONDS.sleep(2);
        } else if ((month.equals("October") || month.equals("october")) && day != 17 && year == 1997){
            System.out.println("We were born in the same month and year!");
            System.out.println("And as my brother would say we are Compupeers. :)");
        } else if ((!month.equals("October") || !month.equals("october")) && day != 17 && year == 1997){
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

        if ((month.equals("May") || month.equals("may")) && day == 27 && year == 1994){
            System.out.println("Wow that's amazing!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You and my brother have the exact same birthday!");
        }
    }
    static class AvaFirstZodiac {
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

        static void zodiacSign() throws IOException, InterruptedException {
            System.out.println("Ava: You probably already know this but your Zodiac sign is: " + zodiac_sign(AvaFirstYesToZodiacSign.month, AvaFirstYesToZodiacSign.day));
            AvaFirstGame.gameOneIntro();

        }
    }
}
