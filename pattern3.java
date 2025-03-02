public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=n; row++) {
            for (int colspa = 1; colspa <=n-row; colspa++) {
                System.out.print(" ");
                
            }
            for (int star = 1  ; star <=row; star++) {
                if(star==1 || star==row|| row==n){
                    System.out.print("*"+ " ");

                }
                else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println();

            
        }
    }
        
}
