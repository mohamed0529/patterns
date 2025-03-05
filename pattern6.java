class pattern6{
    public static void main(String[] args) {
        int n=5;
        for (int row =0; row <n; row++) {
            for (int spa = 0; spa <= n-row-1; spa++) {
                System.out.print("  ");
                
            }
            for (int star = 0; star <2*row+1; star++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}