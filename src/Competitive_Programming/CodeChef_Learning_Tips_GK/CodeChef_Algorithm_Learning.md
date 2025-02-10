# CodeChef or General Algorithm Learning


## Some General Problems and efficient Algorithm

### 1. Check Whether a number of Prime or not
* Efficient way of finding is check all numbers between 2 to Square root of (n). Where n is the number.
* This will be efficient algorithm and logic behind this is
* A prime number is number which has 1 or n (itself) as a factor.
* And what is about this square root of (n) means here. let's take an example of a number as 32.
* 32 factors are
* 1 and 32, (1*32)
* 2 and 16, (2*16)
* 4 and 8.  (4*8) and yeah that's it.
* So you can see finding 2 as factor also gave it's complement factor partner 16.
* So we have total 6 factors of 32, and we got all 6 of them when we iterate from 1 to within 4 (it's like root of 32. i.e. 5. something)
* So for any number even if it was n=49, then upto sqaure root 49 i.e. 7, we would have find it's factor upto 7 iterations only.
* So our code logic will be between 2 and square root n, iterate, and if we find any factor then it is not prime.
* (1 and n is already - but if we find extra then it is not prime ) (So this is how this code works)
* 
 #### Code (Efficient Algo to check whether a number is prime or not)
* Time Complexity O(rootOf(N))
public static isPrime(int n){
    if (n == 1){  //Base case
        return false;
    }
    
    for(int i = 2 ; i <= Math.sqrt(n) ; i++){ //from 2 to square root of n included, check if any factor
        if( n % i == 0){ //if there is factor then mark non prime
            return false;
        }
    }

    return true; //if no factors above then it is prime
}


### 3. Prime Sieve Approach to find or check whether a number is prime or not (Sieve of Strathostens)
* Approach : 
* Make Prime[] array, of size let say how much size of n can be, so let be 100001;
* Now we will try to build array of prime numbers in this array as true if it is prime
* so first create the array and put all numbers as prime as true
* hence 
* boolean[] Prime = new boolean[100001];
* Arrays.fill(Prime, true); 
* since 0 and 1 is not prime, hence base case
* Prime[0]= false; and Prime[1]=false;
* //Now pick every number i from 2 to length of array(Prime), and multiply with each j and put false there
* // as they are multiple of i, hence they can't be prime, so in this way we will build array of prime numbers
* for(int i =2; i <= Prime.length; i++){
  * if(Prime[i]){ //Allow only those value of i to be multiplied which is prime till now. non prime are already taken care
    * for(int j=2 ; i*j < Primes.length ; j++){
      * Prime[i*j]=false; //put if it is multiple of i for all j before array length, then they have more factors
      * //hence it is not prime
    * }
  * }
* }
* Time Complexity O(N * Log(n))


### 4. Finding Factorial and use of module (Still more concept and deep understanding required here)
* Static long mod = 1000000000+7;
* static long fact (long m){ //finding factorial of m
  * //we can make use of DP[] array to store and give final answer
  * long[] DP = new long[m+1];
  * //Base case
  * DP[0]=1 and DP[1]=1; //Basic math
  * for(int i=2; i<=m; i++){
    * DP[i]= ( (i % mod) * (DP[i-1] % mod) ) % mod;
  * }
* return (DP[m] % mod); //here our answer is stored


### 5. Given an array how many pairs you can get to have sum or difference as K
* example arr[] = {10,15,23,14,2,15} and Key=13
* This problem can be solved using contains() function concept of hashset in O(N) time interval if there is no collision.
* Concept is we store the sum and difference with k for that current element of array, and later if we find it we found the pair
* So in this way we will also not end up using duplicates pair. and also if a number is given twice in array then they can be use twice
* for two different pair. Pair will be found when second pair appear in array while traversing will find first one already stored in set. 
* code as 
* int[] arr, int k (given above)
* Set<Integer> set = new HashSet<>();
* int count =0;
* for(int i = 0; i<arr.length; i++){
  * if(set.contains(arr[i]+k)){
    * count++;
  * else if (set.contains(arr[i]-k)){
    * count++;
  * }
  * set.add(arr[i]);
* }
* System.out.println(count);
* hence done,


### 6. (Two Pointer Technique), (Window Sliding Technique), (Trapping Rainwater Problem approach)
* All these are explain better in the notes provided in this package/folder check there only