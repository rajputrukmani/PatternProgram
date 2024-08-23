
class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<0;k++){
            System.out.print(" ");
        }

            for(int j=0;j<2*i-1;j++)
            {
                System.out.print( j);
            }
            System.out.println();
        }
    }
    
}

