public class StarsD {

    private static final int MAX_ROWS = 10;

    public static void starsD() {
        //Counts up each row
        for (int i = 0; i < MAX_ROWS; i++) {
            //runs a separate code for the first half of all rows
            if(i<(MAX_ROWS/2)){
                //starting from 4 times, prints one less space each time
                for (int z = 0; z < (4 - i); z++) {
                    System.out.print(" ");
                }
                //starting at 1, prints 2 more stars per row after the first one
                for (int z = 0; z < (((i + 1) * 2) - 1); z++) {
                    System.out.print("*");
                }
                System.out.println();
            //separate code for the second half
            }else if(i>=(MAX_ROWS/2)){
            for (int z = 0; z < i-5; z++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (((10-i) * 2) - 1); z++) {
                System.out.print("*");
            }
                //On the last run through it breaks early so the println isn't run
                if (i==(MAX_ROWS-1)){
                    break;
                }
            System.out.println();
            }
        }

//        for (int i = 0; i < (MAX_ROWS / 2); i++) {
//            for (int z = 1; z < (5 - i); z++) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < (((i + 1) * 2) - 1); z++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < (MAX_ROWS / 2); i++) {
//            for (int z = 0; z < i; z++) {
//                System.out.print(" ");
//            }
//            for (int z = 0; z < (((5-i) * 2) - 1); z++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//
//        }
    }
}
