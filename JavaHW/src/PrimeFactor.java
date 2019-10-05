public class PrimeFactor { //I could make this class extend the NthPrime class as well...

    public static void main(String[]Args){
    long num = 600851475143L; // This is the num
    boolean cont = true; //this is the for first loop
    boolean cont2 = true; // for second loop

        while(cont) { // the method I will be using is prime factorization

            cont2 = true; //resets the for loop
            for (int i = 2; i < num && cont2; i++) {

                if (num % i == 0) {

                    cont2 = false;
                    num = num / i; //sets the num to the next factor to be tried for factoring

                    i = 2; //resets i
                }

                else if(i+1 == num){ //this is to make sure that the loop will stop, so if the iterations -1 meet it, then the num is prime.
                                     // i+1 to ensure that i doesn't = num, in which case num%i == 0 would be true.

                    cont2 = false;
                    cont = false;
                }
            }
        }

            System.out.println(num); //Print the prime factor
    }
}
