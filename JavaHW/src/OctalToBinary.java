public class OctalToBinary{

    public static int[][] conversion(int a){

        int[][] binary = new int[3][3];

        String num = Integer.toString(a);

        int currentDigit = 0;
        for(int i = 0; i<3; i++){

            currentDigit = Integer.valueOf(num.substring(i,i+1));

            for(int j = 2; j>-1; j--){

                if(currentDigit%2 == 0){

                    binary [i][j] = 0;
                    currentDigit /= 2;

                }
                else{

                    binary[i][j] = 1;

                    currentDigit = (currentDigit - 1)/2;
                }
            }

        }
        return binary;

    }



    public static void main(String[]Args){

        int[][] test = conversion(777);

        for(int i = 0; i<3; i++){

            for(int d = 0; d<3; d++){

                System.out.println(test[i][d]);
            }

        }
    }

}
