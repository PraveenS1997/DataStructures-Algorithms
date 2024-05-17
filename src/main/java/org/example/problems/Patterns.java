package org.example.problems;

public class Patterns {

    public static void patternProblems(){
        /* When N = 5
         *
         * *
         * * *
         * * * *
         * * * * *

        # of lines in the output = N
        # of characters in each line is equal to the line number
        When line = 1, no of stars = 1, N = 4
        When line = 2, no of stars = 2, N = 4
        When line = 3, no of stars = 3, N = 4
        When line = 4, no of stars = 4, N = 4
        Observe and see that no of stars in each line is equal to the line number
        */
        int N = 5;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /* When N = 4
         *
         * 2
         * 2 *
         * 2 * 4

        # of lines in the output = N
        # of characters in each line is equal to the line number
        If the column number is a even number, print that number
        Else print *
         */
        N = 4;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                if(j % 2 == 0) System.out.print(j + " ");
                else System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /*
         When N = 3
         * _ *
         * _ *
         * _ *
         When N = 4
         * _ _ *
         * _ _ *
         * _ _ *
         * _ _ *

        # of lines = N
        # of characters in each line is equal to N
        If the column number is 1st or last, print "*"
        Else print "_
         */

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(j == 1 || j == N) System.out.print("* ");
                else System.out.print("_ ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /*
        When N = 4
         * * * *
         * * *
         * *
         *

        # of lines = N
        When line = 1, no of stars = 4, N = 4
        When line = 2, no of stars = 3, N = 4
        When line = 3, no of stars = 2, N = 4
        When line = 4, no of stars = 1, N = 4
        Observe and see that no of stars can be calculated by => (N - line_number + 1)
        line = 1 => (N - line + 1) = 4
         */

        for(int i=1; i<=N; i++){
            for(int j=1; j<=(N-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /*
        When N = 4
         *     *
         *   *
         *  *
         * *

        # of lines = N
        # 1st & last column values are always "*"
        Find out no of spaces present in each line between stars
        When line = 1, no of spaces = 3, N = 4
        When line = 2, no of spaces = 2, N = 4
        When line = 3, no of spaces = 1, N = 4
        When line = 4, no of spaces = 0, N = 4
        Observe and see that no of spaces can be calculated by => (N - line_number)
         */
        for(int i=1; i<=N; i++){
            System.out.print("* ");
            // no spaces = (N-i)
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            System.out.print("* ");
            System.out.println();
        }

        System.out.println("-----------------------------");

        /* When N = 4
              *
            * *
          * * *
        * * * *

        # of lines in output = N
        # of chars in each line = N
        When line = 1, no of spaces = 3, no of stars = 1, N = 4
        When line = 2, no of spaces = 2, no of stars = 1, N = 4
        When line = 3, no of spaces = 1, no of stars = 1, N = 4
        When line = 4, no of spaces = 0, no of stars = 1, N = 4
        Observe and see that,
        *  no of spaces can be calculated by => (N - line_number)
        *  no of stars is directly equal to line number (i)

        Additional observation: (not required)
        no of characters in a line = N
        N = (# of spaces present in a line) + (# of stars present in a line)
        # of stars present in a line = N - # of spaces present in a line
         */

        for(int i=1; i<=N; i++){
            // # of spaces => (N-i)
            int no_of_spaces = (N-i);

            for(int j=1; j<=no_of_spaces; j++){
                System.out.print(" " + " ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /* When N = 4
         ********
         ***  ***
         **    **
         *      *

         * # of lines in the output = N
         * # of characters in each line = (2*N)
         * # of stars at the start is equal to # of stars at the end
         * When line = 1, # of stars on one side = 4, N = 4
         * When line = 2, # of stars on one side = 3, N = 4
         * When line = 3, # of stars on one side = 2, N = 4
         * When line = 4, # of stars on one side = 1, N = 4
         * Formula to calculate # of stars on one side = (N-i+1)
         * N = # of stars + # of spaces
         * # of spaces = N - # of stars
         * Formula to calculate # of spaces on side = (N - # of stars)
         *
         * Another observation,
         * When line = 1, # of spaces in between is 0
         * When line = 2, # of spaces in between is 2
         * When line = 3, # of spaces in between is 4
         * When line = 4, # of spaces in between is 6
         * Formula to calculate # of spaces in between = ((line - 1) * 2)
         */

        for(int i=1; i<=N; i++){
            int stars = N-i+1;
            int spaces = N - stars;
            for(int a=1; a<=stars; a++){
                System.out.print("*");
            }
            for(int a=1; a<=(spaces*2); a++){
                System.out.print(" ");
            }
            for(int a=1; a<=stars; a++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /* When N = 4
            *
           ***
          *****
         *******

         * # of lines in the output = N
         * # of characters in each line = (2*N-1)
         * # of stars on each line is always in odd => (i * 2 - 1)
         * # of spaces on each line => (# of chars in each line - # of stars on each line) / 2
         */

        int M = 2 * N -1;
        for(int i=1; i<=N; i++){
            int stars = 2 * i - 1;
            int spaces = (M - stars) >> 1;
            for(int a=1; a<=spaces; a++){
                System.out.print(" ");
            }
            for(int a=1; a<=stars; a++){
                System.out.print("*");
            }
            for(int a=1; a<=spaces; a++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
