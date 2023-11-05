package CodeForceContest.Educational_Codeforces_Round_157;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static boolean isLucky (String s){
        int i=0;
        int j=s.length()-1;
        int sum1=0;
        int sum2=0;
       while(i<j){
           sum1+=s.charAt(i);
           sum2+=s.charAt(j);
           i++;
           j--;
       }
       if(sum1 == sum2){
           return true;
       }else{
           return false;
       }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr = new String[n];

        for(int i=0 ; i<n; i++){
            arr[i] = sc.next();
        }

        List<String> oddList = new ArrayList<String>();
        List<String> evenList = new ArrayList<String>();

        for(int i =0 ;i<n;i++){
            if(arr[i].length() % 2 == 0){
                evenList.add(arr[i]);
            }else{
                oddList.add(arr[i]);
            }
        }

        int countOfLuckyPairs = evenList.size() + oddList.size(); //self is always lucky

        //for odd list
        String s1;
        String s2;
        for (int i =0 ; i<oddList.size()-1; i++){
            for(int j = i+1 ; j<oddList.size() ; j++){
                 s1 = oddList.get(i) + oddList.get(j);
                 s2 = oddList.get(j) + oddList.get(i);
                 if(isLucky(s1)){
                     countOfLuckyPairs++;
                 }
                if(isLucky(s2)){
                    countOfLuckyPairs++;
                }

            }
        }

        //for even list
        for (int i =0 ; i<evenList.size()-1; i++){
            for(int j = i+1 ; j<evenList.size() ; j++){
                s1 = evenList.get(i) + evenList.get(j);
                s2 = evenList.get(j) + evenList.get(i);
                if(isLucky(s1)){
                    countOfLuckyPairs++;
                }
                if(isLucky(s2)){
                    countOfLuckyPairs++;
                }

            }
        }

        System.out.println(countOfLuckyPairs);
    }
}