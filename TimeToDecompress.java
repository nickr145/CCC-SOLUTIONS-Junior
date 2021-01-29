import java.util.*;

public class TimeToDecompress
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int L = input.nextInt();

        if (L < 0 || L > 80)
        {
            L = input.nextInt();
        }

        int [] numOfSymbol = new int [L];
        String [] symType = new String [L];

        for (int i = 0; i < L; i++)
        {
            numOfSymbol[i] = input.nextInt();
            symType[i] = input.nextLine();
            symType[i] = symType[i].trim();
        }
        input.close();

        for (int i = 0; i < L; i++)
        {
            for (int j = 0; j < numOfSymbol[i]; j++)
            {
                System.out.print(symType[i]);
            }
            System.out.println("");
        }

    }
}