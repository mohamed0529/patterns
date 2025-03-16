public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n*2;i++){
            if(i<=n-1){
                for(int j=1;j<=n-i;j++){
                    System.out.print("* ");
                }
                for (int k=1;k<=2*i;k++){
                    System.out.print("  ");
                }
                for(int l=1;l<=n-i;l++){
                    System.out.print("* ");
                }
            }
            else{
                for(int s=1;s<=i-n+1;s++){
                    System.out.print("* ");
                }
                for(int m=1;m<2*n-i;m++){
                    System.out.print("  ");
                    

                }
                for(int m=1;m<2*n-i;m++){

                    System.out.print("  ");


                }
                for(int s=1;s<=i-n+1;s++){
                    System.out.print("* ");
                }
            }
            System.out.println();
           
        }
    }
    
}
