package Competitive_Programming.CodeChef_Learning_Tips_GK;

import java.util.Arrays;

public class Prime_Sieve {

    //Finding prime check for all numbers between 1 to 1000001 and storing in Prime array, so that we can get that number
    //whether it is prime or not
    public static boolean[] primes= new boolean[100001];

    public static void fillSieve(){

        Arrays.fill(primes, true);
        //since 0 and 1 is not prime, hence base case
        primes[0]= false;
        primes[1]=false;
        //Now pick every number i from 2 to length of array(Prime), and multiply with each j and put false there
        // as they are multiple of i, hence they can't be prime, so in this way we will build array of prime numbers
        for(int i =2; i < primes.length; i++){
           if(primes[i]){ //Allow only those value of i to be multiplied which is prime till now. non prime are already taken care
             for(int j=2 ; i*j < primes.length ; j++){
               primes[i*j]=false; //put if it is multiple of i for all j before array length, then they have more factors
               //hence it is not prime
             }
           }
        }
    }

    public static void main(String[] args) {

        int n = 19;
        //but first run the function above to populate our array with prime check and then check prime for each numbers
        fillSieve();
        System.out.println("Prime check for "+ n + " is => "+ primes[n]);

        for(int i=0; i<=n; i++){
            System.out.println(i+"+"+primes[i]);
        }

    }
}
