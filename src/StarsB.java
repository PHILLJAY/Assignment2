public class StarsB {

    //Int is final so it can not be changed
    //
    private static final int MAX_ROWS = 10;

    public static void starsB() {
        //Counts up each row
        for (int i = 0; i < MAX_ROWS; i++) {
            //depending on what row we are on it will print the according amount
            //it starts at 10 and with each increase in i (which increases with rows) it increases the amount by 1
            for (int z = 0; z < (i+1); z++) {
                System.out.print("*");
            }
            //on the last run through the loop is broken so the println isnt run
            if (i==(MAX_ROWS-1)){
                break;
            }
            //prints a new line once the stars are all printed
            System.out.println();
        }
    }
}

