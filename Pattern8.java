  class Pettern1 {
    public static void main(String[] args) {
        int num=1;
        int sum=1;
        int i,j;
        for(i=1;i<=5;i++)
        {
            System.out.print(sum);
            for( j=1;j<=sum;j++)
            {
              System.out.print("*");
             }
        
        System.out.println();

        sum = sum+num;
        num++;
       }
    }
}
