public class StarsA {

    //Int is final so it can not be changed
    //
    private static final int MAX_ROWS=10;
    public static void starsA(){
        //Counts up each row
        for (int i = 0; i<MAX_ROWS;i++) {
            //depending on what row we are on it will print the according amount
            //it starts at 10 and with each increase in i (which increases with rows) it lowers the amount by 1
            for (int z = 0; z < (10-i); z++) {
                System.out.print("*");
            }
            //On the last run through it breaks early so the println isnt run
            if (i==(MAX_ROWS-1)){
                break;
            }
            //after the stars are printed it prints a new line
            System.out.println();
        }
    }
}
