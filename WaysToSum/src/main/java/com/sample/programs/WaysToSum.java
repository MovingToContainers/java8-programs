package com.sample.programs;

public class WaysToSum {

    static int NumberOfWays(int total, int k)
    {
        int[] ps = new int[total + 1];
        ps[0] = 1;
        for(int row = 1; row < total + 1; row++)
        {
            for(int col = 1; col < total + 1; col++)
            {
                if (col >= row)
                    ps[col] = ps[col] + ps[col - row];
            }
        }

        for (int i = 0; i < ps.length ; i++) {
            System.out.println("***********:"+ps[i]);

        }
        return(ps[total]);
    }

    public static void main(String[] args)
    {

        // Given inputs
        int N = 5;
        int K = 3;

        System.out.println(NumberOfWays(N, K));
    }
}
