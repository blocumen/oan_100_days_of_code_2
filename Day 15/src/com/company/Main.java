package com.company;

class GFG{

    // Result function with N
    static void result(int beginning, int end)
    {
        // iterate from 0 to N
        for (int num = beginning; num < end; num++)
        {
            // Short-circuit operator is used
            if (num % 3 == 0)
                System.out.print(num + " ");
        }
    }

    // Driver code
    public static void main(String []args)
    {
        // input goes here
        int beginning = 5;
        int end = 50;

        // Calling function
        result(beginning, end);
    }
}
