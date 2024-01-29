public class CreateBox {
    static int LENGTH_OF_BOX = 9;
    static boolean boxEmpty = false;
    public static void createBox() {
            System.out.println("\n\n " + GameLogic.box[0] + " | " + GameLogic.box[1] + " | " + GameLogic.box[2] + " ");
            System.out.println("-----------");
            System.out.println(" " + GameLogic.box[3] + " | " + GameLogic.box[4] + " | " + GameLogic.box[5] + " ");
            System.out.println("-----------");
            System.out.println(" " + GameLogic.box[6] + " | " + GameLogic.box[7] + " | " + GameLogic.box[8] + " \n");

            if (!boxEmpty) {
                for (int i = 0; i < LENGTH_OF_BOX; i++)
                    GameLogic.box[i] = ' ';
                boxEmpty = true;
            }
    }
}
