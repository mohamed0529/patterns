public class pattern7{
    public static void main(String[] args) {
        int n=5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <row; col++) {
                System.out.print("  ");
                
            }
            for (int star = 0; star<2*n-(2*row+1); star++) {
                System.out.print("* ");
                
            }
            System.err.println();
            
        }
        
        
    }
}