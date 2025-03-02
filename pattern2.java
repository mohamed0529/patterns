public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=n; row++) {
            for (int colspa = 1; colspa <=n-row; colspa++) {
                System.out.print(" ");
                
            }
            for (int star = 1  ; star <=row; star++) {
                System.out.print("*"+ " ");
                
            }
            System.out.println();

            
        }
    }
    
}
