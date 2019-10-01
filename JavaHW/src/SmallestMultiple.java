public class SmallestMultiple {

    public static void main(String[]Args){

        int [] divide = new int[20];

        int num = 1;
        for(int i = 0; i<divide.length; i++){

            divide[i] = num;

            num = num+1;

        }

        num = 0;

        int b =1;
        for ( b = 1; num != 20; b++){

            for(int c = 0; c < 20; c++){

                if(b % divide[c] == 0){

                    num += 1;

                }

                else {

                    num = 0;

                }

            }

        }

        System.out.println("Num is: " + (b-1));


    }

}


