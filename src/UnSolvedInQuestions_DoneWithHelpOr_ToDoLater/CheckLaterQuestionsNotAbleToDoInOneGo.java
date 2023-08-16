package UnSolvedInQuestions_DoneWithHelpOr_ToDoLater;

public class CheckLaterQuestionsNotAbleToDoInOneGo {

    /**
     * Q. Remove Element (LeetCode - Easy)
     */

    public static int removeElement(int[] nums, int val) {
        int n=nums.length;

        //EdgeCase When length=0 means just return 0
        if(n==0){ return 0;}
        if (n==1){
            if(nums[0]==val){
                return 0;
            }else{
                return 1;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(val==nums[i]){
                count++;
            }
        }
        if(count==0){
            return n;
        }

        int i=0;int j=0;
        for(int a=0;a<n;a++){
            if(nums[a]==val){
                i=a;
                break;
            }
        }
        for(int b=n-1;b>0;b--){
            if(nums[b]!=val){
                j=b;
                break;
            }
        }

        if(i>=j){
            return n-count;
        }

        while (i<j){
            if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }
            else{
                //go forward and find ith position of val or next
                if(nums[i]!=val){
                    for(int x=i;x<=j;x++){
                        if(nums[x]==val){
                            i=x;
                            break;
                        }//Just in case there are no other than we need to update i for that also
                        if(x==j){
                            i=j;
                            break;
                        }
                    }
                }

                //go backward from last and find jth position where no val
                if(nums[j]==val){
                    for (int y=j;y>=i;y--){
                        if (nums[y]!=val){
                            j=y;
                            break;
                        }
                        if(j==i){
                            j=y;
                            break;
                        }
                    }
                }
            }
        }
        return n-count;

    }

    public static void main(String[] args) {
        //int[] nums = {0,1,2,2,3,0,4,2}; int val=2;
        //int[] nums = {3,3}; int val=5;
        int[] nums = {1,2,3,4};
        int val = 1;
        int size =removeElement(nums,val);
        System.out.println(removeElement(nums,val));

        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }
}
