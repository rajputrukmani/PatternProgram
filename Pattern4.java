
class Pattern4 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<0;k++){
            System.out.print(" ");
        }

            for(int j=0;j<i;j++)
            {
                System.out.print( j);
            }
            System.out.println();
        }
    }
    
}

