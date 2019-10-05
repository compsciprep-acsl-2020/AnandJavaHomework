public class Multiples {



        public static void main(String[]Args){

            int sum = 0; //Initializes sum

            for(int i = 0; i<1000; i++){ //checks all numbers 1 through 1000

                if(i%3 == 0){ //if the num is a multiple of 3, then add to the sum

                    sum += i;

                }

                else if(i%5 == 0){ // if the num is a multiple of 5, add to the sum

                    sum +=i;

                }

                else {           //default state, not really needed, but for clarity

                    sum = sum;

                }

            }

            System.out.println(sum);    //prints the sum

        }

    }
