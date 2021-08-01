import java.util.*;
import java.util.concurrent.TimeUnit;

public class JamesGame {
    final static Scanner sc = new Scanner(System.in);


    static void gameIntro() throws InterruptedException {
        System.out.println("Honestly I am so over talking about zodiac signs");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Lets play a quick game of Tic Tac Toe");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Did you need a refresher on how to play?");
        System.out.print("> ");
        String answer = sc.next();

        if (answer.equals("Yes") || answer.equals("yes")){
            System.out.println("The rules are very simple.");
            System.out.println("The object of the game is to try and get 3 or more x's  or o's in a row");
            System.out.println("Whoever succeeds at this wins");
            System.out.println("We could also both fail and it could end in a tie");
            System.out.println("Alright enough talking, lets play some Tic Tac Toe");
        } else if (answer.equals("No") || answer.equals("no")){
            System.out.println("Great! Prepare to lose lol");
        }

    }

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

       public static void gamePlay () {
        // Create a Scanner object attached to the keyboard
        Scanner scan = new Scanner (System.in);
        // Gameboard print
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        //User input requests
        while(true) {
            System.out.println("Enter your placement (1-9):");
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions) || cpuPositions.contains(playerPos)){
                System.out.println("Position taken! Enter another position:");
                playerPos = scan.nextInt();
                //Prevent user from printing on top of CPU
                while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                    System.out.println("Position taken! Enter another position:");
                    playerPos= scan.nextInt();
                }
            }

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
            //CPU random positions
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                break;
            }
        }

    }
    public static void placePiece(char[][] gameBoard, int pos, String user){

        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        } else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static String checkWinner(){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning){
            if(playerPositions.containsAll(l)){
                return "You won? :( I cant believe this. Well in the end I did want a challenge. Good game.";
            } else if(cpuPositions.containsAll(l)){
                return "Heheheh I knew I would win :). You did put up a good fight though. Good game!";
            } else if(playerPositions.size() + cpuPositions.size() == 9){
                return "Not the outcome that I was expecting.";
            }
        }

        return "";
    }
    public static void printGameBoard (char [][] gameBoard){
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
