import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AvaGame{
    final static Scanner sc = new Scanner(System.in);

    public static class ShuffleString {
        public static String shuffleJava8(String text){
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
                System.out.println("Unscramble: " + ShuffleString.shuffleJava8(getRandomLineFromFile()));
                System.out.print("Your answer: ");
                String answer = scanner.next();


                boolean compare = (new Scanner(file).useDelimiter("\\Z").next().contains(answer));

                if (compare){
                    numberCorrect++;
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
        System.out.println("Hmmmm... so we talked about our Zodiac signs");
        System.out.println("OOO OOooo oo ha forgive my excitement but would you want to play a game with me? :)");
        System.out.println("If not its okay we can always do something else.");
        System.out.print(">");
        String answerOne = sc.next();

        if (answerOne.contains("Yes") || answerOne.contains("yes")) {
            System.out.println("Yay okay so... the game I want to play with you is one of my favorites");
        } else if (answerOne.contains("No") || answerOne.contains("no")) {
            System.out.println("That's okay we can do something else!");
        }

        System.out.println("Just a quick reminder of how to play");
        System.out.println("There will be a total of 30 different words on the screen.");
        System.out.println("Each one of us has 10 seconds to unscramble the six letters shown on the screen");

        System.out.println("Ready to start?");
        System.out.print("> ");
        String answerTwo = sc.next();

        System.out.println("Great! lets begin.");
        ShuffleString.actualGame();
    }
}
