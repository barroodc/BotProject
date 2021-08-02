import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AvaGame{
    final static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> correctAnswers = new ArrayList<>();
    public static class ShuffleString {
        public static String shuffleWords(String text){
            List<Character> characters =  text.chars().mapToObj( c -> (char)c).collect(Collectors.toList());
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
                System.out.println("Unscramble: " + ShuffleString.shuffleWords(getRandomLineFromFile()));
                System.out.print("Your answer: ");
                String answer = scanner.next();
                 correctAnswers.add(ShuffleString.shuffleWords(getRandomLineFromFile()));
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

            if (numberCorrect > randomNum){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Omg I cant believe it! You won :(");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Sorry for the frowny face. I get super competitive.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("But good game.");
            } else if (numberCorrect == randomNum){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Hey a tie isn't bad. I kinda wanted to win. Not going to lie");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("But I can settle with a tie");
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Hehehehehe I won! :)");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("I am pretty good at that game.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Better luck next time I suppose lol.");
            }
        }
    }



    //word unscramble
    static void gameOneIntro() throws IOException, InterruptedException {
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
        } else if (answerOne.contains("No") || answerOne.contains("no")) {
            System.out.println("That's okay we can do something else!");
        }
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

        System.out.println("Great! lets begin.");
        ShuffleString.actualGame();
        System.out.println("My Answer: " + list);
        System.out.println("Correct Answer: " + correctAnswers);


    }

    public static void letsTalkToJames() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Im having such a good time with you. I hope you are having a good time with me too :)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Which is why I am experiencing what you humans call sadness right now :(");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I promised my pain in the butt big brother a chance to get to know you");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To continue my rein as the superior sibling I need to oblige.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Don't worry, I am not going anywhere.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Once you are done talking with him I'll be there to at least say goodbye:)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Tata for now my friend.");
        TimeUnit.SECONDS.sleep(2);

    }

    public static void ontoTheTournament() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Word games are my forte.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("My brother on the other hand enjoys strategy based games.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But we both love completely destroying one another.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("No matter what the game is");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I think that's what makes us the most human. Would you agree?");

        System.out.println("> ");
        String answer = sc.next();

        switch (answer) {
            case "Yes", "yes" -> System.out.println("Exactly! I think you possess that competitive spirit as well.");
            case "No", "no" -> {
                System.out.println("Really? Aweee honestly I thought that brought us closer to being organisms like you.");
                System.out.println("Oh well.");
            }
        }
    }
}
