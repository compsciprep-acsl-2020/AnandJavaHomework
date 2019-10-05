public class SmallestMultiple {

    public static void main(String[]Args){

        int [] divide = new int[20]; //this array will contain all the numbers 1 through 20, yes 1 is really not needed.

        int num = 1;
        for(int i = 0; i<divide.length; i++){

            divide[i] = num; //sets it to num

            num = num+1; // increments num so it can be used for the next cell

        }

        num = 0; // num is now ready to be reused

        int b =1; // initializes b
        for ( b = 1; num != 20; b++){ //basically checks that each num 1 through 20 is true

            for(int c = 0; c < 20; c++){ //20 iterations

                if(b % divide[c] == 0){ //each num must divide it

                    num += 1; // if it is divided, then 1 is added, and until num is 20, it will keep running

                }

                else {

                    num = 0;  // if it is not divided by all numbers, it is set back to 0, and this
                              // nested for loop will be reset by the exterior for loop

                }

            }

        }

        System.out.println("Num is: " + (b-1)); // once condition is satisfied, it will print, but subtract one to offset an extra iteration


    }

}


