
public class Pattern3 {
    public static void main(String[] args)
    {
        int a = 4;
        for(int i=0;i<=a-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        for(int i=a-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
