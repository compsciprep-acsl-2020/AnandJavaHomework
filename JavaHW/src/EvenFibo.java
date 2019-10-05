public class EvenFibo {


        public static void main(String[]Args){
            // Initializing the fibonacci focus points, and the sum of even numbers
            int f1 = 1;

            int f2 =2;

            int f3 = 0;

            int sum = 0;
            // While all of the focuses are less than 4 million, the focus points will be incremented and checked.
            while(!(f1 > 4000000 || f2 > 4000000||f3 > 4000000)){


                if(f1%2 == 0){    //Checks if f1 is even

                    sum+= f1;

                }

                if(f2%2 == 0){    //Checks if f2 is even

                    sum+= f2;

                }

                if(f3 % 2 == 0){  //checks if f3 is even

                    sum += f3;

                }

                f3   = (f1 + f2); //sets f3 to the sum of the last two foci

                f1  = (f3 + f2); //sets f1 to the sum of the last two foci

                f2 = (f3 + f1) ; // sets f2 to the sum of the last two foci

            }

            System.out.println(sum); // prints the sum of the evens.

        }

    }


