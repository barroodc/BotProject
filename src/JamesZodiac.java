import java.io.IOException;
import java.util.Scanner;

public class JamesZodiac {
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


    static void zodiacSign() throws InterruptedException, IOException {
        System.out.println("James: You probably already know this but your Zodiac sign is: " + zodiac_sign(JamesBirthdayQA.month,JamesBirthdayQA.day));
        JamesGame.gameIntro();
        JamesGame.gamePlay();
        JamesGame.letsTalkToAva();

    }

}


