public class EvenFibo {


        public static void main(String[]Args){

            int f1 = 1;

            int f2 =2;

            int f3 = 0;

            int sum = 0;

            while(!(f1 > 4000000 || f2 > 4000000||f3 > 4000000)){


                if(f1%2 == 0){

                    sum+= f1;

                }

                if(f2%2 == 0){

                    sum+= f2;

                }

                if(f3 % 2 == 0){

                    sum += f3;

                }

                f3   = (f1 + f2);

                f1  = (f3 + f2);

                f2 = (f3 + f1) ;

            }

            System.out.println(sum);

        }

    }


