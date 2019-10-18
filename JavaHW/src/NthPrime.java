public class NthPrime {

    public static boolean isPrime(int a){ //new prime method to check whether numbers are prime

        for(int i = 2; i <= a/2; i++){     //numbers that lower than half of the number are checked, these are the only ones needed.

            if((a % i == 0) && (!(a==i))){   // if the number can be divided by a certain number, which is not itself, it is not prime

                return false;

            }

        }

        return true;        // else, it is prime

    }

    public static void main(String[]Args){

        int count = 0; //count is the element number of the prime, e.g 2 would be n1 and 3 would be n2

        int num = 2; //this is the first prime
        for( num = 2; count != 10000; num++){ //until element no 10001 is reached, keep looping, however it will add one extra val, so this must be offset

            if(isPrime(num)){ //checks whether the num is prime

                count += 1; // if so increments the element number by 1

            }

        }
        if(isPrime(num-1)) // checks that the num we got is indeed prime, subtracting one to offset the extra iteration
            System.out.println(num-1);

    }

}



