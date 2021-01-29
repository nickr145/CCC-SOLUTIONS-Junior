import java.util.*;
//TO BE COMPLETED
public class WinningScore
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int [] a = new int [3];
        int [] b = new int [3];

        int multiplierA = 3;

        for (int i = 0; i < 3; i++)
        {
            if (multiplierA < 1)
            {
                break;
            }

            a[i] = (input.nextInt() * multiplierA);
            multiplierA--;
        }

        int multiplierB = 3;

        for (int i = 0; i < 3; i++)
        {
            if (multiplierB < 1)
            {
                break;
            }

            b[i] = (input.nextInt() * multiplierB);
            multiplierB--;
        }

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < 3; i++)
        {
            sumA += a[i];
        }

        for (int i = 0; i < 3; i++)
        {
            sumB += b[i];
        }

        if (sumA == sumB)
        {
            System.out.println("T");
        }
        else if (sumA > sumB)
        {
            System.out.println("A");
        }
        else if (sumA < sumB)
        {
            System.out.println("B");
        }
    }
}