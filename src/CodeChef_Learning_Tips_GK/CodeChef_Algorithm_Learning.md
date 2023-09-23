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