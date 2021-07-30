import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordsGenerated {

    public static class ShuffleString {
        public static String shuffleJava8(String text){
            List<Character> characters =  text.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
            StringBuilder result = new StringBuilder();
            IntStream.range(0,text.length()).forEach((index) -> {
                int randomPosition = new Random().nextInt(characters.size());
                result.append(characters.get(randomPosition));
                characters.remove(randomPosition);
            });
            return result.toString();
        }
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

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);

        File file = new File("/Users/christopher/Desktop/finallist.txt");
        Scanner sc = new Scanner(file);

        System.out.println("Unscramble: " + ShuffleString.shuffleJava8(getRandomLineFromFile()));
        System.out.print("Your answer: ");
        String answer = scanner.next();

        int numberCorrect = 0;
        for (int i = 0; i < 30; i++){

        }
    }
}
