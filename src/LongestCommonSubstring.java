import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring {

    public static  String longestCommonSubstring(String[] strs) {

        //Here we have done code for LongestCommonSubstring and it is different from longest common prefix. so check it.

        //Take out all possible substring list from first 2 strings
        //Now check this list of substrings if contains() in other strings. If present then return the one with longest, if none then return "" empty string

        if(strs.length==1){//for edge case 1, when only 1 string is given.
            return strs[0];
        }

        String str1=strs[0];
        String str2=strs[1];
        List<String> list = new ArrayList<>();
        char c1,c2;
        String substring="";

        for (int i=0;i<str1.length();i++){
            c1=str1.charAt(i);
            substring="";

            for(int j=0;j<str2.length();j++){
                c2=str2.charAt(j);

                if(c1==c2){
                    substring+=c1;
                    if(!list.contains(substring)){
                        list.add(substring);
                    }

                    int x=i+1;int y=j+1;
                    while(x<str1.length() && y<str2.length()){
                        c1=str1.charAt(x);  c2=str2.charAt(y);

                        if(c1==c2){
                            substring+=c1;

                            if(!list.contains(substring)){
                                list.add(substring);
                            }
                            x++;y++;
                        }
                        else{
                            //back to original value of c1 and c2 and substring
                            c1=str1.charAt(i); c2=str2.charAt(j);substring="";
                            break;
                        }
                        if(x==str1.length() || y==str2.length()){
                            c1=str1.charAt(i); c2=str2.charAt(j);substring="";
                            break;
                        }
                    }
                }
            }
        }

        //Now we have populated our substring List with all possible substring in first two string.
        //Now traverse this substring with each string and start removing unfound substring
        // System.out.println(list); //to check the list

        //First remove edge case, when there is only two string then return the length of the largest substring from the list.
        if (strs.length==2){
            int length=0,maxLength=0;
            String ans="";
            for(int i=0;i<list.size();i++){
                length=list.get(i).length();
                if(length>maxLength){
                    maxLength=length;
                    ans=list.get(i);
                }
                return ans;
            }
        }
        else{
            for(int i=0;i<list.size();i++){
                String substr=list.get(i);
                for(int j=2;j<strs.length;j++){
                    if(!strs[j].contains(substr)){
                        list.remove(substr);
                        i--;
                    }
                }
                if(list.size()==0){
                    return "";
                }
            }
            //Now whatever is left in the list, chose the substring with maxLength and return it
            int length=0; int maxLength=0; String ans="";
            for(int i=0; i<list.size();i++){
                if (list.get(i).length()>maxLength){
                    maxLength=list.get(i).length();
                    ans=list.get(i);
                }
            }
            return ans;
        }

        return "";

    }
    public static void main(String[] args) {
        String[] strs= {"dog","racecar","car"};
        System.out.println(longestCommonSubstring(strs));

    }

    //Just for practise kept here for practise.
    public static  String longestCommonPrefix(String[] strs) {
        //Edge case 1 : when we have some empty string, then just return "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){
                return "";
            }
        }

        //Edge Case 2 : when we have single string only, then return that string only
        if(strs.length==1){
            return strs[0];
        }

        //All the rest cases, when now we have no empty string and also we have more than 1 string
        String str1=strs[0];
        String str2=strs[1];
        List<String> list = new ArrayList<>();
        char c1,c2;
        String substring="";

        for (int i=0;i<1;i++){
            c1=str1.charAt(i);
            substring="";

            for(int j=0;j<str2.length();j++){
                c2=str2.charAt(j);

                if(c1==c2){
                    substring+=c1;
                    if(!list.contains(substring)){
                        list.add(substring);
                    }

                    int x=i+1;int y=j+1;
                    while(x<str1.length() && y<str2.length()){
                        c1=str1.charAt(x);  c2=str2.charAt(y);

                        if(c1==c2){
                            substring+=c1;

                            if(!list.contains(substring)){
                                list.add(substring);
                            }
                            x++;y++;
                        }
                        else{
                            //back to original value of c1 and c2 and substring
                            c1=str1.charAt(i); c2=str2.charAt(j);substring="";
                            break;
                        }
                        if(x==str1.length() || y==str2.length()){
                            c1=str1.charAt(i); c2=str2.charAt(j);substring="";
                            break;
                        }
                    }

                    if(x==str1.length() || y==str2.length()){
                        c1=str1.charAt(i); c2=str2.charAt(j);substring="";

                    }
                }
            }
        }

        //Now we have populated our substring List with all possible substring in first two string.
        System.out.println(list);
        //Now traverse this substring with each string and start removing unfound substring
        // System.out.println(list); //to check the list

        //First remove edge case, when there is only two string then return the length of the largest substring from the list.
        if (strs.length==2){
            int length=0,maxLength=0;
            String ans="";
            for(int i=0;i<list.size();i++){
                length=list.get(i).length();
                if(length>maxLength){
                    maxLength=length;
                    ans=list.get(i);
                }

            }
            return ans;
        }
        else{
            for(int i=0;i<list.size();i++){
                String substr=list.get(i);
                for(int j=2;j<strs.length;j++){
                    if(!strs[j].contains(substr)){
                        list.remove(substr);
                        i--;
                    }
                }
                if(list.size()==0){
                    return "";
                }
            }
            //Now whatever is left in the list, chose the substring with maxLength and return it
            int length=0; int maxLength=0; String ans="";
            for(int i=0; i<list.size();i++){
                if (list.get(i).length()>maxLength){
                    maxLength=list.get(i).length();
                    ans=list.get(i);
                }
            }
            return ans;
        }


    }
}
