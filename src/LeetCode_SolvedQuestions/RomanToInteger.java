package LeetCode_SolvedQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> map= new HashMap<Character,Integer>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);

        int sum=0;
        char previousChar = s.charAt(s.length()-1);
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(i==s.length()-1){
                sum+= map.get(c);
                previousChar=c;
            }
            else{
                if(map.get(c) < map.get(previousChar)){  //There can be always one in negative way. example IV=4, But we can never have IIV=3 (III=3)
                    sum-=map.get(c);
                    previousChar=c;
                }
                else{//when either equal or greater than
                    sum+=map.get(c);
                    previousChar=c;
                }
            }

        }
        return sum;

    }


    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));

    }
}
