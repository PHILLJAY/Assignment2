public class StarsA {
    private static final int MAX_ROWS=10;
    public static void starsA(){
        int j = 10;
        for (int i = 0; i<MAX_ROWS;i++) {
            for (int z = 0; z < j; z++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
    }
}
