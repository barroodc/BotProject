import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cpuFirstHangman {
    //cpu should guess from an algorithm that selects random letters from the alphabet.
    //These random letters will be cross referenced with the word from the list.
    static Scanner s = new Scanner(System.in);
    static int numberIncorrect = 0;
    public static char[] lettersFromWord;


    public static void avaWon() throws IOException, InterruptedException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("Ava: Since I am the clear winner I will gladly go first");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: I wish our human friend could see me rolling my eyes at you right now");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Haha so funny. Someone is just a sore loser.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Alright, enough talk lets play!");
        avaCpuGoesFirst();
    }

    public static void jamesWon() throws IOException, InterruptedException {
        File file = new File("/Users/christopher/Desktop/Hangman.txt");
        Scanner sc = new Scanner(file);
        System.out.println("James: Haha I knew I would win. In your face Ava!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: Yeah yeah yeah, blah blah blah");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ava: So are you going to go or not?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("James: Yeah yeah, I'm going, I'm going.");

    }

    //If I select to go first I need two more james and ava methods like the ones above.

    public static void numberIncorrect() {
        if (numberIncorrect == 1) {
            HangManStructure.oneIncorrectAnswer();
        } else if (numberIncorrect == 2) {
            HangManStructure.twoIncorrectAnswers();
        } else if (numberIncorrect == 3) {
            HangManStructure.threeIncorrectAnswers();
        } else if (numberIncorrect == 4) {
            HangManStructure.fourIncorrectAnswers();
        } else if (numberIncorrect == 5) {
            HangManStructure.fiveIncorrectAnswers();
        } else if (numberIncorrect == 6) {
            HangManStructure.sixIncorrectAnswers();
        }
    }

    public static int ava = 0;
    public static int james = 0;

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


    public static void avaCpuGoesFirst() throws IOException {
        Scanner scanner = new Scanner(new File("/Users/christopher/Desktop/Hangman.txt"));

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        HangManStructure.beginningStructure();
        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));

        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
        }

        int count = 0;
        int numberCorrect = 0;
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) != randomizedCharacter){
                numberIncorrect++;
                System.out.println(word.charAt(i));
            }
        }


        System.out.println();
        System.out.println(word);

    }




    public static void jamesCpuGoesFirst() throws IOException {


    }

    public static void main(String[] args) throws IOException, InterruptedException {
       avaCpuGoesFirst();
    }
}



