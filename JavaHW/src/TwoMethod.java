import java.util.*;

public class TwoMethod {



    public static double F2C(double f){

        return 9/5.0 *(f-32);

    }

    public static double C2F(double c){

        return 5/9.0 *(c) +32;
    }

    public static void main(String[]Args){

        Scanner s = new Scanner(System.in);

        System.out.println("Press 0 to use f2c, Press 1 to use c2f");

        int type = s.nextInt();

        System.out.println("Enter the value");

        double num = s.nextDouble();

        if(type == 0){

            System.out.println(F2C(num));
        }

        else{

            System.out.println(C2F(num));
        }
    }




}
