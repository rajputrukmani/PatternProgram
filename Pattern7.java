public class Demo
  {
    public static void main(String []args)
    {
      int i,j,c;
      int a=-1;
      int b=1;
      for(i=1;i<=4;i++)
        {
          for(j=1;j<-i;,j++)
            {
              c=a+b;
              System.out.print(c);
              a=b;
              b=c;
              
            }
          System.out.println(" ");
        }
      
    }
  }
