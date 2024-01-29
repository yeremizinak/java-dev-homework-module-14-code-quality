import java.util.Scanner;
public class CheckInput {
    static Scanner scan = new Scanner(System.in);
    public static void checkInput(){
        while (true) {
            GameLogic.input = scan.nextByte();
            if (GameLogic.input > 0 && (GameLogic.input < CreateBox.LENGTH_OF_BOX + 1)) {
                if (GameLogic.box[GameLogic.input - 1] == 'X' || GameLogic.box[GameLogic.input - 1] == 'O')
                    System.out.println("That one is already in use. Enter another.");
                else {
                    GameLogic.box[GameLogic.input - 1] = 'X';
                    break;
                }
            } else
                System.out.println("Invalid input. Enter again.");
        }
    }
}
