public class GameLogic {
    static byte input, rand, i, winner = 0;
    static boolean boxAvailable = false;
    static char[] box = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    public static void gameLogic() {
        while (true) {
            //Creating default box with numbers
            CreateBox.createBox();

            //Checking if "winner" is not 0 to finish the game
            if (winner == 1) {
                System.out.println("You won the game!\nCreated by Shreyas Saha. Thanks for playing!");
                break;
            } else if (winner == 2) {
                System.out.println("You lost the game!\nCreated by Shreyas Saha. Thanks for playing!");
                break;
            } else if (winner == 3) {
                System.out.println("It's a draw!\nCreated by Shreyas Saha. Thanks for playing!");
                break;
            }

            //Check the number the User input
            CheckInput.checkInput();

            //Check if there is still available place for the game
            boxAvailable = false;
            for (i = 0; i < CreateBox.LENGTH_OF_BOX; i++) {
                if (box[i] != 'X' && box[i] != 'O') {
                    boxAvailable = true;
                    break;
                }
            }

            //Draw situation
            if (!boxAvailable) {
                winner = 3;
                continue;
            }

            //Algorithm for User win
            if ((box[0] == 'X' && box[1] == 'X' && box[2] == 'X') || (box[3] == 'X' && box[4] == 'X' && box[5] == 'X') || (box[6] == 'X' && box[7] == 'X' && box[8] == 'X') ||
                    (box[0] == 'X' && box[3] == 'X' && box[6] == 'X') || (box[1] == 'X' && box[4] == 'X' && box[7] == 'X') || (box[2] == 'X' && box[5] == 'X' && box[8] == 'X') ||
                    (box[0] == 'X' && box[4] == 'X' && box[8] == 'X') || (box[2] == 'X' && box[4] == 'X' && box[6] == 'X')) {
                winner = 1;
                continue;
            }

            //Algorithm for Computer win
            if ((box[0] == 'O' && box[1] == 'O' && box[2] == 'O') || (box[3] == 'O' && box[4] == 'O' && box[5] == 'O') || (box[6] == 'O' && box[7] == 'O' && box[8] == 'O') ||
                    (box[0] == 'O' && box[3] == 'O' && box[6] == 'O') || (box[1] == 'O' && box[4] == 'O' && box[7] == 'O') || (box[2] == 'O' && box[5] == 'O' && box[8] == 'O') ||
                    (box[0] == 'O' && box[4] == 'O' && box[8] == 'O') || (box[2] == 'O' && box[4] == 'O' && box[6] == 'O')) {
                winner = 2;
                continue;
            }

            //Computer's moves
            while (true) {
                rand = (byte) (Math.random() * (CreateBox.LENGTH_OF_BOX - 1 + 1) + 1);
                if (box[rand - 1] != 'X' && box[rand - 1] != 'O') {
                    box[rand - 1] = 'O';
                    break;
                }
            }
        }
    }
}
