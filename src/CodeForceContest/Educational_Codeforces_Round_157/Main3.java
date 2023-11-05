package CodeForceContest.Educational_Codeforces_Round_157;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int box=sc.nextInt();
            int key=sc.nextInt();
            int travel=sc.nextInt();

            if(box >= key){
                System.out.println(box);
            }else{
                //if box < kye
                if((box + travel) > key){
                    System.out.println(key);
                }else{
                    int ans = box + travel + 2 * (key - (box + travel));
                    System.out.println(ans);
                }

            }
        }
    }
}