public class pattern6
{
  public static void main(String[]args)
  {
    int i,j;
    for(i=1;i<=4;i++)
      {
        if(i%2==0)
        {
          System.out.print(" ");
        }
        for(j=1;j<=5;j++)
          {
            System.out.print("*");
          }
        System.out.println(" ");
      }
  }
}
