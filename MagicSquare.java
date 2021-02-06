import java.util.*;

public class MagicSquare
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        boolean magic = true;
        String [] l1 = input.nextLine().split(" ");
        String [] l2 = input.nextLine().split(" ");
        String [] l3 = input.nextLine().split(" ");
        String [] l4 = input.nextLine().split(" ");
        int total = Integer.parseInt(l1[0]) + Integer.parseInt(l2[0]) + Integer.parseInt(l3[0]) + Integer.parseInt(l4[0]);

        String [][] lines = {l1, l2, l3, l4};
        
        for (int i = 0; i < 4; i++)
        {
            if (Integer.parseInt(l1[i])+Integer.parseInt(l2[i])+Integer.parseInt(l3[i])+Integer.parseInt(l4[i]) != total)
            {
                magic = false;
                break;
            }

            int temp = 0;
            for (String num: lines[i])
            {
                temp += Integer.parseInt(num);
            }
            if (temp != total)
            {
                magic = false;
                break;
            }

        }
        System.out.println((magic)? "magic":"not magic");

    }
}