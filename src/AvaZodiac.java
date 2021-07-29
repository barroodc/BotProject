import java.util.*;


public class AvaZodiac extends ChatBot {

    final static Scanner sc = new Scanner(System.in);

    public AvaZodiac(String name, String botBirthMonth, int botBirthDay, int botBirthYear) {
        super(name, botBirthMonth, botBirthDay, botBirthYear);
    }
        static void zodiacSign() {
        System.out.println("You probably already know this but your Zodiac sign is: " + Zodiac.zodiac_sign(month,day));
    }
}
