import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AvaFirstGame {
    final static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> correctAnswers = new ArrayList<>();
    public static class ShuffleString {
        public static String shuffleWords(String text){
            List<Character> characters =  text.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
            StringBuilder result = new StringBuilder();
            IntStream.range(0,text.length()).forEach((index) -> {
                int randomPosition = new Random().nextInt(characters.size());
                result.append(characters.get(randomPosition));
                characters.remove(randomPosition);
            });
            return result.toString();
        }

        public static String getRandomLineFromFile() throws IOException {
            File file = new File("/Users/christopher/Desktop/finallist.txt");
            final RandomAccessFile f = new RandomAccessFile(file, "r");
            final long randomLocation = (long) (Math.random() * f.length());
            f.seek(randomLocation);
            f.readLine();
            String randomLine = f.readLine();
            correctAnswers.add(randomLine);
            f.close();
            return randomLine;
        }

        public static void actualGame() throws IOException, InterruptedException {
            final Scanner scanner = new Scanner(System.in);

            File file = new File("/Users/christopher/Desktop/finallist.txt");
            Scanner sc = new Scanner(file);

            int count = 0;
            int limit = 30;
            int numberCorrect = 0;


            while (count < limit) {
                count++;
                System.out.println("Unscramble: " + AvaFirstGame.ShuffleString.shuffleWords(getRandomLineFromFile()));
                System.out.print("Your answer: ");
                String answer = scanner.next();
                correctAnswers.add(AvaFirstGame.ShuffleString.shuffleWords(getRandomLineFromFile()));
                boolean compare = (new Scanner(file).useDelimiter("\\Z").next().contains(answer));

                if (compare){
                    numberCorrect++;
                } else{
                    list.add(answer);
                }
            }

            System.out.println("Your correct number of Answers:" + numberCorrect);

            int randomNum = ThreadLocalRandom.current().nextInt(0, 30);

            System.out.println("Avas number of correct Answers: " + randomNum);

            System.out.println("My Answer: " + list);
            System.out.println("Correct Answer: " + correctAnswers);

            if (numberCorrect > randomNum){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ava: Omg I cant believe it! You won :(");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Sorry for the frowny face. I get super competitive.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: But good game.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Lets meet back up with James to see how hes doing.");
                JamesSecond.greetAfterAva();
                JamesSecond.birthdayIntro();
            } else if (numberCorrect == randomNum){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ava: Hey a tie isn't bad. I kinda wanted to win. Not going to lie");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: But I can settle with a tie");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Lets meet up with James to see how hes doing.");
                JamesSecond.greetAfterAva();
                JamesSecond.birthdayIntro();
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ava: Hehehehehe I won! :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: I am pretty good at that game.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Better luck next time I suppose lol.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Ava: Lets meet up with James to see how hes doing.");
                JamesSecond.greetAfterAva();
                JamesSecond.birthdayIntro();
            }
        }
    }



    //word unscramble
    static void avasGameFirst() throws IOException, InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Hmmmm... so we talked about our Zodiac signs");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("OOO OOooo oo ha forgive my excitement but would you want to play a game with me? :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("If not its okay we can always do something else.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print(">");
        String answerOne = sc.next();

        if (answerOne.contains("Yes") || answerOne.contains("yes")) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Yay okay so... the game I want to play with you is one of my favorites");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("So the game is called unscramble the words.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("There will be a total of 30 different words on the screen.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("We are going to try and unscramble as many words as we can");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Whoever unscrambles more wins.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Ready to start?");
            System.out.print("> ");
            String answerTwo = sc.next();
            if (answerTwo.equals("Yes") || answerTwo.equals("yes")){
                System.out.println("Great! lets begin");
                AvaFirstGame.ShuffleString.actualGame();
            } else if (answerTwo.equals("No") || answerTwo.equals("no")){
                System.out.println("Its okay take your time. When you are ready just type the word ready in all lower case below:");
                System.out.print("> ");
                String ready = sc.next();
                AvaFirstGame.ShuffleString.actualGame();
            }
        }else if (answerOne.contains("No") || answerOne.contains("no")) {
            System.out.println("That's okay we can do something else!");
            letsTalkToJames();
        }
    }

    static void letsTalkToJames() throws InterruptedException, IOException {
        System.out.println("So unfortunately, my big brother keeps messaging me about if Im done yet.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Obviously not but in order to make him less annoying I am going to hand you off to him.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I promise though we'll talk to each other shortly after you're done :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Have Fun!");
        TimeUnit.SECONDS.sleep(2);
        JamesSecond.greetAfterAva();
        JamesSecond.birthdayIntro();
    }
}
