public class pattern4{
    public static void main(String[] args) {
        int n=5;
        for (int row = n; row >=1; row--) {
            for (int colspa = n; colspa <n; colspa--) {
                System.out.print(" ");
                
            }
            for (int star = 1  ; star <=row; star++) {
                System.out.print("*"+ " ");
                
            }
            System.out.println();

            
        }
    }
    
}
