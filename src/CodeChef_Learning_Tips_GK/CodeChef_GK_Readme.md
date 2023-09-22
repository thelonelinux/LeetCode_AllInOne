# CODECHEF

## Basics Understandings, Tips, CodingStyle, GK and Overall Learning

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