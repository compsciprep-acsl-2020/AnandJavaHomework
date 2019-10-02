public class PrimeFactor { //600851475143

    public static void main(String[]Args){
    long num = 600851475143L;
    boolean cont = true;
    boolean cont2 = true;

        while(cont) {

            cont2 = true;
            for (int i = 2; i < num && cont2; i++) {

                if (num % i == 0) {

                    cont2 = false;
                    num = num / i;

                    i = 2;
                }

                else if(i+1 == num){

                    cont2 = false;
                    cont = false;
                }
            }
        }

            System.out.println(num);
    }
}
