public class SquareSum {

    public static void main(String[]Args){

        int sum1 = 0;

        int sum2 = 0;

        for(int i = 0; i<= 100; i++){

            sum1 += (i*i);

        }

        for(int b = 0; b<= 100; b++){

            sum2 += b;

        }

        sum2 =sum2 * sum2;

        System.out.println(Math.abs(sum1 - sum2));

    }

}
