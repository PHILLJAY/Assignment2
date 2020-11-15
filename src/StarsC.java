public class StarsC {
    private static final int MAX_ROWS = 10;

    public static void starsC() {
        //Counts up each row
        for (int i = 0; i < MAX_ROWS; i++) {
            //depending on what row we are on it will print the according amount of spaces
            //it starts at 0 and with each increase in i (which increases with rows) it increases the amount by 1
            for (int q = 0; q <(1+i);q++){
                System.out.print(" ");
            }
            //depending on what row we are on it will print the according amount of stars
            //it starts at 10 and with each increase in i (which increases with rows) it lowers the amount by 1
            for (int z = 0; z < (10-i); z++) {
                System.out.print("*");
            }
            //On the last run through it breaks early so the println isn't run
            if (i==(MAX_ROWS-1)){
                break;
            }
            System.out.println();
        }
    }
}
