public class StarsB {
    private static final int MAX_ROWS = 10;

    public static void starsB() {
        int j = 1;
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int z = 0; z < j; z++) {
                System.out.print("*");
            }
            System.out.println();
            j++;
        }
    }
}

