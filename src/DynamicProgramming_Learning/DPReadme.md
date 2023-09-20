# DYNAMIC PROGRAMMING


## Before going to Dynamic Programming you should know how recursion works

### First we will learn about Dynamic Programming using 1D Array.


### Basic Concepts for using Dynamic Programming
* Basically we make use of smaller sub-problem to solve larger solve problem.
* Trick is finding this sub-problem.
* This sub-problem you store in DP Array.

## Examples of 1D Array Dynamic Programming

# Example 1 : Fibonacci Series.
* The series looks like 0,1,2,3,5,8,13,...
* So ultimately it is adding previous two values to get current output.
* So sub-problem or substructure for this problem is
* dp[n]= dp[n-1] + dp[n-2];
* So as we can see here larger problems are just constitute of smaller problems, hence we can solve this using Dynamic Programming
* Here Base Case will be : DP[0] (Just ignore this, not interested in zeroth term), DP[1]=0 and DP[2]=1, (So this is first two terms of fibonacci series)

# Example 2 : Minimum Steps to 1
* Problem Statement : We have given 3 steps to reduce a number to 1.
* We can follow one of these 3 operations  at any steps :
* 1. N-1 (Subtract 1 from given number), 2. N/2 (Divide the number by 2), 3. N/3 (Divide the number by 3)
* So here also if we have some large value given let say 12, then we can ask it's next step value to give it's answer
* We can ask DP(12-1) to check, how much they take to reduce to 1, similarly we can check DP(12/2) and DP(12/3).
* And whichever will have minSteps to get to 1 we will get that and then also add 1 to the answer as we have used 1 step to get that DP
* So our sub-problem or sub-structure here will look like this
* DP[N]=Math.min(DP[N-1], DP[N/2], DP[N/3]) + 1 ;   //Given that N is divisible by 2 and 3.
* Also here Base Case will be : DP[0] = Integer.MaxValue, DP[1]=0 (As we need no step to get 1 as we already have 1),
* DP[2]=1 (Just one step: either divide by 2, or just subtract 1), DP[2]=1, and DP[3]=1 (As divide by 2 and 3 respectively, so only 1 step)


# Example 3 : Minimum Coins use to get Sum
* Problem Statement : We have given some coins denominations as Coins[]={1,2,5,10,20,50,100};
* We can use each of this coin denomination any number of times
* We have given a Sum let say Sum=137, We need to make use of this coins and using less number of coins, get the sum.
* Here also idea is we can get answer by breaking this bigger problem in sub-problem,
* Example like we use each of this coins one by one, (It does not matter whether Coins[] array is in sorted order or not).
* So when we take one coin our sum reduced to sum=sum-Coins[i], and we will ask, that reduced sum to see and tell me what is the optimal
* way to get your sum, so in this way by solving sub-problem of smaller sums we can get answer for larger sum,
* So technically our sub-problem looks like this:
* DP[N]=Math.min(DP[N-Coins[1], DP[N-Coins[2], DP[N-Coins[3], DP[N-Coins[4], ... upto whatever the size of Coins Array is ) + 1
* Plus 1 is used because we have taken the current coin, so 1 coin is counted in the list of coin used.
* Here base case will be simple DP[N]={Integer.MaxValue}, Initially we take infinite coins to get for each sum
* Another base case will be Dp[0] = 0 ; (as we cannot get sum with any number possible ways of coins taken).




## All these above-mentioned problem can be solved in either of two ways of Dynamic Programming Approach

1. Top-Down Approach - Time Complexity O(N^2):
* For me, it is a bit difficult to understand

2. Bottom-Up Approach - Time Complexity O(N^2):
* Easy to understand and understand the pattern of sub-problem as discussed in above example only. you can see.
* By making DP[] Array and Storing values into it from zeroth index and moving to N index to get answer
* This is like storing the values of our sub-problem so that later it can be used by bigger problems
* It's like memoization (It will store the sub-problem answers like memorizing it)

3. Recursive call (Not DP Approach) - This takes O(2^N). Let's not discuss for this for now.

