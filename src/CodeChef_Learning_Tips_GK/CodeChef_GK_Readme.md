# CODECHEF

## Basics Understandings, Tips, CodingStyle, GK and Overall Learning

### Whenever you get some new concept in problem solving, then don't write whole code and notes, but approach, or pattern
* which you have found in that problem, and also provide link to it. and little bit of code will do, but enough explaining
* so that next time you try you must be able to understand what was the approach exactly.

### Very Basic to Take Care as a Competitive Programmer
* 1. Look for every possible test cases, edge cases, constraints given in problem
* 2. Solve the problem in a page, write the code there and at end if you feel it handles everything then start writing code.
* 3. If the constraints are 0<=n<=10^9, then that problem has to be solved in O(N)  time complexity.
  * If N can go upto 10^5 or 7 then it has to be done in O(N^2) or O(NLogN) time

### Mostly Java Coding Language We use so GK In it
#### 1. Use to Try Catch Block in your code (NZEC - Segmentation Error)
* Sometimes you get NZEC (Segmentation Error) even though your code is running fine in IntellijIdea or local computer,
* but giving NZEC in codechef editor, In that case you can use 
* try{ //..write yoour code here}
* Catch(){}
* So this is use of try catch Block

#### 2. Use of long type instead of int variable when size of integer is greater than 10^12.
* int value can hold upto 10^9, so usually use long value.
* * e.g. 0<=n<=10^12, can be constraint given in your problem.


#### 3. Don't create an array of size more than 10^5, or it will give Sisgev error.
* Sometimes Sisgev error in your code although your coe is all correct.
* Because you don't need to allocate array for the same. see the constraints, it will go out of memory
* e.g. 0<=n<=10^12, can be constraint given in your problem.
* Try to get ans with storing values in finite number of variable and just finding the end ans. 
* Example in fibonacci series, if we want to look for fibonacci of n=10^8, then we don't want to create array of that size as it will
* give out of memory error, even using list will give same error. as list internally uses array only.
* so do such questions by using finite number of variable if they are recurring, or usually they can be solved by 
* finite number of variables only if such large constraints of n is given in problem.


#### 4. Modulo (1,000,000,007) or (10^9+7)
* In some questions we are given to calculate final answer in Modulo to (10^9+7).
* It is because there output calculation can be more than integer value or larger than long value also
* So in case of doing sum then we can do in below way
* InCorrect Way
* long mod = 1000000007;
* sum=sum+arr[i];  //this is wrong way
* Correct Way
* sum = ( (sum % mod) + ((arr[i]) % mod) ) % mod ; //this is the correct way

#### 5. Use of BufferedWriter gives AC whereas use of System.out.println() gave TLE.
* BufferedWriter bw = new BufferedWriter(num+ ""); //Gave all correct
* System.out.println(num+ """); //gave TLE. 
* This is called efficient writing or buffered writing, storing all answer and at end return the complete output
* instead of returning answer for each testcase at a time.
* Also when using BufferedReader you need to use throws java.lang.Exception in it's main function as mentioned below
* public static void main (String[] args) throws java.lang.Exception{
* // write your code here
* };

#### 6.Sometimes use of only BufferedReader or FastReader instead of Scanner gives AC instead of Partial AC
* Same concept as mentioned above. Scanner is slower than FastReader and BufferedReader

#### 7. As usually Scanner use can be fine, to input any type of value, but if sometimes not then
* We have BufferedReader to input the values, like multiple strings in same line, what if we take space as part of string so
* We do code as below 
* BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
* for(int i = 0 ; i < testCases ; i++){
  * String lines = br.readLine();
  * String[] str= lines.trim().split("\\s+");
  * int i1 = Integer.pars2tInt(str[0]);
  * int i2= Integer.parseInt(str[1]);
  * System.out.println(i1+i2); }
* Input for this case would be like
* 2
* 1 4
* 5
* 4 5
* 9
* For now just ignore such things, as they are not usually required, simple scanner has always worked fine
* and in codeforces and leetcode we just have function to implement. Our algorithm is what that matters and not inputting 
* and outputting everytime.
* For string with spaced code will be like
* String lines = br.readLine();
* String[] str= lines.trim().split("\\s+");
* for(int i = 0; i<arr.length; i++){
  * arr[i]= str[i];
  * }


### Note About Codechef
* 1. WA (Wrong Answer) - Meaning : Means the answer is not correct, as probably not all the test cases or edge cases are handled.