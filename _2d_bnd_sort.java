
import java.util.*;
public class _2d_bnd_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int i,j,k,t;
        System.out.println("enter the elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(k=0;k<(r*c);k++)
        {
            i=0;
            j=0;
            while(j<(c-1))
            {
                if((a[i][j+1])<(a[i][j]))
                {
                    t=a[i][j];
                    a[i][j]=a[i][j+1];
                    a[i][j+1]=t;
                }
                j++;
            }
            while(i<(r-1))
            {
                if((a[i+1][j])<(a[i][j]))
                {
                    t=a[i][j];
                   a[i][j]=a[i+1][j];
                   a[i+1][j]=t;
                }
                i++;
            }
            while(j>0)
            {
                if((a[i][j-1])<(a[i][j]))
                {
                    t=a[i][j];
                    a[i][j]=a[i][j-1];
                    a[i][j-1]=t;
                }
                j--;
            }
            while(i>1)
            {
                if((a[i-1][j])<(a[i][j]))
                {
                    t=a[i][j];
                    a[i][j]=a[i-1][j];
                    a[i-1][j]=t;
                }
                i--;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }               
}
