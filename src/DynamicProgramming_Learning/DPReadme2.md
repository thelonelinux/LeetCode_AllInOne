# Dynamic Programming Learning

## How to identify if the given problem can be solved using DP Approach
* If you feel in that problem we are gonna need all the permutation and combination of given array or values
* permutation and combination can come in different way, like sometimes repetition not allowed, sometimes it is allowed
* sometimes we can take bunch in one go like substring, sometimes we can't take in bunch, not in continuous, like subsequence. so overall it is asking
* one way or other to get all the PnC possibles.
* So to get those somehow this will be going to take O(2^N) time complexity, or any other polynomial time complexity like O(n^n)
* so if we come across such situation in our competitive programming problems, then
* it can be definitely solved by DP approach in either O(n^2) or O(n^3) time complexity
* the idea is to find the sub-problem and its pattern and able to code it, also find the edge cases with good explanation

## Sub-Problem Concept in Dynamic Programming
* Example in Coin Change, our sub-problem is how much minm coins required to get rs 1 coin, and then rs 2 coin and then rs 3 coin
* and so on it goes upto N (Required sum). So later this N can ask it's lower member sum to give him the answer they have calculated already.
* So in this way by solving smaller problem we are now solving larger problem

* In Case of Longest Common Subsequence, our sub-problem is first taking empty string both str1 and str2 and checking LCS, and then later as we go in 2D array
* we check taken 1 char of first str and 1 char of second string 2 and then so on we keep on updating answers in this way for whole of both string and finally
* we get the answer by asking previously solved answers of which we have stored in DP[i-1][j-1] for current i,jth string char added in str1 and str2 to get answer


## Here we will begin with some problem using Dynamic Programming

### Use of Multidimensional array to store sub-problem
* For now, we have written only for bottom up approach, for top-down approach and polynomial approach you can check in Geeksforgeeks, there you can find all approach with explanation, here we have only added which we are following and easy to understand. So following only bottom up approach only.

#### Example 1 : Longest Common Subsequence (DP on String - using 2-Dimensional DP array)
* Problem statement : Given two string s1="BCDAACD" and s2="ACDBAC" find the longest common subsequence.
* First we will find the length of longest common subsequence and then find the lcs string
* So we will build two dimensional DP Array to store the sub-problem. DP[n+1][m+1], where n amd m is the length of the string.
* First we will initialize the Base case in DP as DP[0][i]={0} and DP[j][0]={0}. This denotes when other string is empty then we have lcs size as 0.
* DP[i][j] means, taken upto ith length of str1 and jth length of str2 at that point, what should be our answer, it looks like that. So basically we are calculating sub-problem here.
* Our sub-problem here is like this : Now we will take from i=1 to j=1, as 0 base case is handled above
* if(s1.charAt(i-1) == s2.charAt(j-1)) //If the string matches. Here it is i-1 and j-1 because we are starting to populate DP from i=1 and j=1. but string starting from i-1 and j-1 as 0th index of strings
  * DP[i][j]=DP[i-1][j-1] + 1 ; //Means add one to previous taken string taken together
* else{ //If they do not match
  * DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]); //Return the previous lcs length either from previous row or previous column we have got till now.

* At the end of this DP[n+1][m+1] = This will give the length of our LCS.
* to find the string of LCS we will follow below approach
* Step 1 : Traverse the 2D Array Starting from DP[n][m], Do following for every cell DP[i][j]
  * If character in (s1 adn s2) corresponding to DP[i][j] are same (Or S1[i-1] == S2[j-1]), then include this character as part of LCS
  * Else compare values of DP[i-1][j] and DP[i][j-1] and go in direction of greater value


#### Example 2 : Floyd Warshall Algorithm (DP on Graph - using 2-Dimensional DP array)
* Problem Statement : Find the shortest path between two nodes for given directed weighted graph
* This algorithm is for finding the shortes path between all the paris of vertices in a weighted graph, This algorith works for both the directed and undirected weighted graphs.
* But, it does not work for the graphs with negative cycles (Whether the sum of the edges in a cycle is negative).
* To see the question in detail and the input graph visit this website
* https://www.programiz.com/dsa/floyd-warshall-algorithm
* Here sub-problem is : 
* Take the distance via vertex k from i(source) to j(destination).
* If you find the smallest possible then update the DP[i][j] with the smallest value


#### Example 3 : Longest Increasing Subsequence (DP on Array Using 1-Dimensional DP)/(This can be also done by using LCS DP concept - using 2-Dimensional DP Array)
* Problem Statement : Given an array {3, 10, 2, 1, 20}, find the length of the longest subsequence of given sequence such that all elements of the subsequence
* are sorted in increasing order. so answer for above is : {3,10,20} and length of the sub-sequence is 3
* Base Case : Assign all the DP[i] initial value to 1, as each element at least means 1 Sub-sequence.
* Here sub-problem is : 
* As we can see that after every numbers taken later let's say arr[2], we would like to ask to arr[0] and arr[1], 
* that if you are smaller than me (that is arr[2] > arr[1 or 0], and if your DP[0] or DP[1] value is greater than
* my current DP[2] value, (which we have initialized to 1 as in base case above), then yeah I would like to have you in my subsequence of increasing order
* and update my DP[2] as DP[0 or 1 (whichever has max)] + 1 ; //1 here means including current array value and so on.
* So our main sub-problem or substructure pattern code will look like
* for(i = 1 to arr.length) //take each vlaue from second index only, because first index will be only 1 subseqeunce to itself as it does not have previous value then it on left hand side of array
  * for (j = 0 to j < i) // take all value on left hand side of arr[i].
    * check if (arr[i] > arr[j] && DP[i] < DP[j] + 1) //check if they left hand size arrays are smaller then current array value, 
    * and also check if their DP value is 1 greater than the value they are storing already, as we have included one more array items so.
    * If they satisfy the condition then pass that value to our current DP, i.e. DP[i]=DP[j] + 1 ;
    * Or you could have done this way also
    * check if (arr[i] > arr[j])
      * If previous element is small then pass this value
      * DP[i] = Math.max(DP[i], DP[j]+1); //this is similar to what we have done above
* So this is all about Longest Increasing Subsequence
* After Updating DP, traverse the DP array and check which value is max and return that, we will get length of longest increasing subsequence.
* TO PRINT THE LONGEST INCREASING SUBSEQUENCE
* We can solve this problem using the concept of Longest Common Subseqeuence
* So we have given arr[] = {3, 10, 2, 1, 20}, Treat this as 1 string, and we can have other string2 as in sorted order of this array as str2={1,2,3,10,20}
* So on applying LCS on it, we will get length of longest Increasing subseqeuence and also get the list of strings in this subsequence.


#### Example 4 : Longest Common Substring
* Problem Statement : Given two string str1 = "GEEKSWHO" and str2=GEEKSFORYOU
* Find the longest common Substring between them.
* So this is same like Longest Common Subsequence problem but here we have some minor changes
* BASE CASE : Initial DP[0][j] = {0} and DP[i][0]={0}
* And for Sub-problem code will be like : 
* for( i to m)
  * for (j to n)
    * if(str1.charAt(i) == str2.charAT(j)){
      * If they match then just update diagonally previous value DP[i][j]= DP[i-1][j-1]+1;
    * Else : DP[i][j] = 0; //here unlike Longest Common Subsequence we not looking if previous or previous matching happened at some place but here we are
    * checking for continous matching only, we don't care if there were some matching before, we want just direct previous matching, so we don't get the
    * max value of DP[i][j-1] or DP[i-1][j] like in Longest Common Subsequence, we are not looking for subsequence but for string
* Also to get the substring, we can store the index of largest value yet recorded in DP array. 
* Later we can use that index, and just go diagonally opposite previous value until we get matching char to get the answers and hence done
* Check the code,

## All topics In DP PatternszxxaX 
𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐀𝐥𝐥 𝐏𝐚𝐭𝐭𝐞𝐫𝐧𝐬 𝐏𝐫𝐞𝐩𝐚𝐫𝐚𝐭𝐢𝐨𝐧 𝐁𝐬𝐭 🔥

Pattern ->𝟏𝐃 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠
1) Climbing Stairs
2) Frog Jump
3) Frog Jump with K
4) Maximum sum of Non-adjacent elements
5) House robber 2
6) Ninja's Training

Pattern -> 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐆𝐫𝐢𝐝𝐬 / 𝟐𝐃
1) Grid Unique Paths
2) Unique Paths
3) Minimum path sum in Grid
4) Tringle (Fixed Starting Point and Variable Ending Point)
5) Minimum/Maximum Falling Path Sum
6) Cherry Pickup 2

Pattern -> 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐒𝐮𝐛𝐬𝐞𝐭𝐬 / 𝐒𝐮𝐛𝐬𝐞𝐪𝐮𝐞𝐧𝐜𝐞
1) Subset Sum Equals to Target
2) Partition Equals Subset Sum
3) Partition A subset into 2 subset with minimum absolute sum diff.
4) Count Subsets With Sum K
5) Count Partitions with given difference
6) 0/1 Knapsack
7) Minimum Coins
8) Target Sum
9) Coin Change 2
10) Unbounded Knapsack 1 D array
11) Rod Cutting 1 D array

Pattern -> 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐒𝐭𝐫𝐢𝐧𝐠𝐬
1) Print Length Of Longest Common Subsequence
2) Print Longest Common Subsequence
3) Longest Palindromic Subsequence
4) Minimum Insertion to Make String Palindrome
5) Minimum Insertions/Deletions to Convert String A -> B
6) Shortest Common SuperSequence
7) Distinct Subsequence
8) Edit Distance
9) Wildcard Matching

Pattern -> 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐒𝐭𝐨𝐜𝐤𝐬
1) Best Time To Buy and Sell Stock (Buy Ones & Sell Ones )
1) Best Time To Buy and Sell Stock 2 (Unlimited Time Buy & Sell)
1) Best Time To Buy and Sell Stock 3 ( At Max 2 Times Buy & Sell)
1) Best Time To Buy and Sell Stock 4 (K times Buy & Sell )
1) Best Time To Buy and Sell Stock 5 (Buy & Sell With Cooldown)
1) Best Time To Buy and Sell Stock 6 (Buy & Sell With Extra Fee)

Pattern -> 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐋𝐨𝐧𝐠𝐞𝐬𝐭 𝐈𝐧𝐜𝐫𝐞𝐚𝐬𝐢𝐧𝐠 𝐒𝐮𝐛𝐬𝐞𝐪𝐮𝐞𝐧𝐜𝐞 (LIS)
1) Print Length Of Longest Increasing Subsequence
2) Print Longest Increasing Subsequence
3) Largest Divisible Subset
4) Longest String chain
5) Longest Bitonic Subsequence
6) Number Of Longest Increasing Subsequence

Pattern -> 𝐇𝐚𝐫𝐝𝐞𝐬𝐭 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐏𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠 𝐎𝐧 𝐩𝐚𝐫𝐭𝐢𝐭𝐢𝐨𝐧
1) Matrix Chain Multiplication
2) Minimum Cost To cut The Stick
3) Burst Balloons
4) Evaluate Boolean
5) Palindrome Partitioning 2
6) Partition Array For Maximum Sum
7) Maximum Rectangle Area with all 1's (Dp on Rectangle)
8) Count Square Submatrices with all ones (Dp on Rectangle)

"𝐈 𝐓𝐡𝐢𝐧𝐤 𝐓𝐡𝐞𝐬𝐞 𝐀𝐥𝐥 𝐐𝐮𝐞𝐬𝐭𝐢𝐨𝐧𝐬 𝐀𝐫𝐞 𝐄𝐧𝐨𝐮𝐠𝐡 𝐓𝐨 𝐌𝐚𝐬𝐭𝐞𝐫𝐢𝐧𝐠 𝐃𝐲𝐧𝐚𝐦𝐢𝐜 𝐩𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐢𝐧𝐠"

You will find all the solutions and explanations on this channel takeUforward by Raj Vikramaditya bhaiya 🔥

#dsa #interviewprepration #dp #dynamicprogramming #algorithum

### Important Links - To Learn More About DP
* https://leetcode.com/discuss/general-discussion/458695/Dynamic-Programming-Patterns