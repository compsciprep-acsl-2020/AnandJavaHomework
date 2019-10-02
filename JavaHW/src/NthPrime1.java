public class NthPrime1 {


        public static boolean isPrime(int a){

            for(int i = 2; i <= a/2; i++){

                if((a % i == 0) && (!(a==i))){

                    return false;

                }

            }

            return true;

        }

        public static void main(String[]Args){

            int count = 0;

            int num = 2;
            for( num = 2; count != 10001; num++){

                if(isPrime(num)){

                    count += 1;

                }

            }
            if(isPrime(num-1))
                System.out.println(num-1);

        }

    }




