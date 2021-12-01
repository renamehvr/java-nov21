/*
    For example if N = 5 then pattern will be like:
        0 0 0 0 1 0 0 0 0
        0 0 0 2 3 2 0 0 0
        0 0 3 4 5 4 3 0 0
        0 4 5 6 7 6 5 4 0
        5 6 7 8 9 8 7 6 5 
        there is a space after each int value excluding  last int of the row
  */

package dayseven.javaclass;
public class NumericPyramid {
    public static void main(String[] args) {
        int N = 5;
        int max = 0;
        int count;
        for (int i = 1; i <= N; i++) {
            max = 2 * i - 1;          // for first row (i=1) max would be 2*1 +1 =3
            count=0;
            for (int j = 1; j < N - i + 1; j++) {
                System.out.print("0 ");
                count++;
            }
            //System.out.print(max+" ");
            for (int x = 0; x < i; x++) {
                System.out.print(i + x + " ");
                count++;
            }

            for (int x = max; x > i; x--) {
                count++;
                if (count==2*N-1){
                    System.out.print(x-1);
                }
                else
                System.out.print(x - 1 + " ");
            }
            for (int x=N+i-1 ; x < 2*N-1 ; x++){
                count++;
                if (count==2*N-1){
                    System.out.print("0");
                }
                else
                System.out.print("0 ");
            }
            System.out.println();
        }

        // else System.out.print("0 ");
    }}
