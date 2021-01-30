import java.util.*;

public class Flipper
{

    // 1  2
    // 3  4

    public static void horizontal (int [][] grid)
    {
        int temp = grid[0][0];
        grid[0][0] = grid[1][0];
        grid[1][0] = temp;

        temp = grid[0][1];
        grid[0][1] = grid[1][1];
        grid[1][1] = temp;
    }

    public static void vertical (int [][] grid)
    {
        int temp = grid[0][0];
        grid[0][0] = grid[0][1];
        grid[0][1] = temp;

        temp = grid[1][0];
        grid[1][0] = grid[1][1];
        grid[1][1] = temp;
    }

    public static void main(String [] args)
    {
        Scanner input  = new Scanner(System.in);
        
        
        int [][] grid = new int [][]
        {
                {1, 2},
                {3, 4},
        };

        String flip = input.nextLine();
        input.close();

        for (int i = 0; i < flip.length(); i++)
        {
            if (flip.charAt(i) == 'H')
            {
                horizontal(grid);
            }
            else
            {
                vertical(grid);
            }
        }
        
        for(int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println("");
        }

    }
}