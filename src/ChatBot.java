import java.io.IOException;
import java.text.ParseException;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChatBot {

    final static Scanner sc = new Scanner(System.in);
    public static String name;
    public static String botBirthMonth;
    public static int botBirthDay;
    public static int botBirthYear;
    public static String month;
    public static int day;

    public ChatBot(String name, String botBirthMonth, int botBirthDay, int botBirthYear) {
        ChatBot.name = name;
        ChatBot.botBirthMonth = botBirthMonth;
        ChatBot.botBirthDay = botBirthDay;
        ChatBot.botBirthYear = botBirthYear;
    }


    public static void main(String[] args) throws ParseException, InterruptedException, IOException {
        ChatBot maleFriend = new ChatBot("James", "May", 27, 1994);
        ChatBot femaleFriend = new ChatBot("Ava", "October", 17, 1997);
        welcomeMessage();
    }

    static void welcomeMessage() throws InterruptedException, IOException {
        System.out.println("Welcome and thank you for choosing this interactive experience.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("My name is James. Im a male cyborg and Im interested in getting to know you better.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("I have a sister named Ava whose a bit younger thats also interested in getting to know you.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Also I would appreciate if you kept most of your answers in the form yes or no.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Im still learning the language and my knowledge is still primitive in nature.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Would you be interested in getting to know me or my sister first?");
        TimeUnit.SECONDS.sleep(3);
        //Add progress bar if user should choose sister.

        boolean valid = false;
        String answer;

        while (!valid) {

            System.out.print("> ");
            answer = sc.next();

            if (answer.equals("You") || answer.equals("you") || answer.equals("James") || answer.equals("james")) {
                System.out.println("Great! I cant wait to get started getting to know you.");
                JamesIntro.greet();
                JamesIntro.birthdayIntro();
                valid = true;

            } else if (answer.equals("Ava") || answer.equals("ava") || answer.equals("Your sister") || answer.equals("your sister")) {
                System.out.println("Hey, no hard feelings, I'll connect you with her now.");
                TimeUnit.SECONDS.sleep(4);
                AvaIntro.avaGreet();
                AvaIntro.birthDayIntro();
                valid = true;
                //Weird that I cant type in "your sister" as another available field.
            } else {
                System.out.println("Im sorry, can you please type in either my name or my sisters?");
            }
        }

    }
}














