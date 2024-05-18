package org.example.problems;

public class Patterns2 {
    public static void patternProblems(){
        /* When N = 5
         * * * * *
          * * * *
           * * *
            * *
             *
         */

        int N = 5;
        for(int i=1; i<=N; i++){
            int spaces = i-1;
            int stars = (N-i+1);
            for(int a=1; a<=spaces; a++){
                System.out.print(" ");
            }
            for(int a=1; a<=stars; a++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        /* When N = 5
        0 0 0 0 1 0 0 0 0
        0 0 0 2 3 2 0 0 0
        0 0 3 4 5 4 3 0 0
        0 4 5 6 7 6 5 4 0
        5 6 7 8 9 8 7 6 5

        # of lines in the output = N
        # of characters in each line = (2 * N - 1)
        # of spaces at start & end in each line is same
        # of spaces on one side = (N-line)
        In each line,
            * the number starts is equal to line no
            * it increases till (2 * line_no -1)
            * then it decreases until value becomes the line no
         */

        N = 4;
        for(int i=1; i<=N; i++){
            int zeros = N-i;
            for(int j=1; j<=zeros; j++)
                System.out.print("0 ");

            int start = i;
            int mid = 2 * i -1;

            while (start <= mid){
                System.out.print(start + " ");
                start++;
            }

            mid--;

            while(mid >= i){
                System.out.print(mid + " ");
                mid--;
            }

            for(int j=1; j<=zeros; j++)
                System.out.print("0 ");

            System.out.println();
        }
    }
}
