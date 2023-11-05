package CodeForceContest.Educational_Codeforces_Round_157;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n = sc.nextInt();
            int[] arr = new int[2*n];

            for(int i=0; i<2*n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int[][] arr2 = new int[n][2];

            for(int i =0 ;i<n; i++){
                arr2[i][0] = arr[i];
                arr2[i][1] = arr[n+i];
            }

            int sum = 0;
            for(int i =0; i<n-1; i++){
                sum+=Math.abs(arr2[i][0] - arr2[i+1][0]);
                sum+=Math.abs(arr2[i][1] - arr2[i+1][1]);

            }

            System.out.println(sum);

            for(int i =0; i<n; i++){
                System.out.println(arr2[i][0] + " " + arr2[i][1]);

            }

        }
    }
}