public class FactorialDigits {

    public static int DigitAdd(long a){

        String thing = new String(Long.toString(a));
        int sum = 0;
        for(int i = 0; i <thing.length()-1; i++){

            sum += (Long.parseLong(thing.substring(i, i+1)));
        }

        return sum;

    }
    public static void main(String[]Args){

        System.out.println(DigitAdd(123L));


    }
}
