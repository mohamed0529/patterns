public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= (2 * n) - 1; row++) {
            int colTimes = row > n ? (2 * n) - row : row;
            for (int col = 1; col <= colTimes; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
