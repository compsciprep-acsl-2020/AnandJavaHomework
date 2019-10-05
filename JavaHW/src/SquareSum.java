public class SquareSum {

    public static void main(String[]Args){

        int sum1 = 0;

        int sum2 = 0;

        for(int i = 0; i<= 100; i++){

            sum1 += (i*i); //this is the sum of squares 1 through one hundred

        }

        for(int b = 0; b<= 100; b++){

            sum2 += b; // first take the sum of all nums 1, through 100
                       // if you want to be like Gauss, yes you can use his formula, and get 5050

        }

        sum2 =sum2 * sum2; //squares the sum of all of the nums 1 through 100(5050)

        System.out.println(Math.abs(sum1 - sum2)); //Take the difference, bigger doesnt matter due to abs value

    }

}
