public class JamesZodiac extends ChatBot {


    public JamesZodiac(String name, int botBirthDay) {
        super(name, botBirthDay);
    }

    public static void zodiacSign(){
        Zodiac zodiac = new Zodiac(month);
        Zodiac zodiac2 = new Zodiac(day);
        System.out.println("You probably already know this but your Zodiac sign is: " + zodiac);
    }
}

