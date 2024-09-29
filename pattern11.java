 class Pattern {
    public static void main(String[]args)
    {
            
           for(int i=1;i<=7;i++)
           {
            for(int b=1;b<=i;b++)
            {
                System.out.print("");
            }
             for(int j=1;j<=i;j++)
             {
                if(i%2==1)
                {
                    System.out.print("*");
                }
                 
             }
             System.out.println();
            }

            for(int k=9;k>=1;k--)
            {
                for(int b=k;b<=9;b++)
            {
                System.out.print(" ");
            }
               for(int a=1;a<=k;a++){
               if(k%2==1){
                System.out.print("*");
            }
           }
           System.out.println();
       }
            
            
            
        
    }
    
}
