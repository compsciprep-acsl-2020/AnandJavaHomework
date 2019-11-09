import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class DigitReassembly {

    public static int numDigits(BigInteger i){

       String test = i.toString();

       return test.length();
    }
    public static int sumDigits(BigInteger a){

        String test = a.toString();

        int sum = 0;

        for(int i = 0; i<test.length(); i++){
            sum += Integer.parseInt(test.substring(i,i+1));

        }
        return sum;
    }
    public static int sumOdds(BigInteger a){

        String test = a.toString();

        int sum = 0;

        for(int i = 0; i<test.length(); i++){
            if(i%2 == 0) {
                sum += Integer.parseInt(test.substring(i, i + 1));
            }
        }
        return sum;

    }
    public static int numFour(BigInteger a){

        String test = a.toString();

        int sum = 0;

        for(int i = 0; i<test.length(); i++){
            if(Integer.valueOf(test.substring(i,i+1)) == 4){

                sum += 1;
            }
        }
        return sum;

    }
    public static int middleNum(BigInteger a){

        String test = a.toString();
        int dontLookAtMyCodeUnlessYouAreTeacher = 0;
        int thing = test.length()/2;
        if(test.length()%2 == 0){

            dontLookAtMyCodeUnlessYouAreTeacher = Integer.valueOf((test.substring(thing-1,thing)));

        }
        else{
            dontLookAtMyCodeUnlessYouAreTeacher = Integer.valueOf(test.substring(thing, thing+1));
        }
        return dontLookAtMyCodeUnlessYouAreTeacher;
    }
    public static void main(String[]Args) throws IOException{
        File file = new File("C:\\Users\\Anand Vinod\\Desktop\\dAssemblyInput.txt");
        Scanner s = new Scanner(file);
        ArrayList<BigInteger> cool = new ArrayList<BigInteger>();
        while(s.hasNextLine()){
        BigInteger a = new BigInteger(s.nextLine());
        cool.add(a);

        }
        System.out.println(numDigits(cool.get(0)));
        System.out.println(sumDigits(cool.get(1)));
        System.out.println(sumOdds(cool.get(2)));
        System.out.println(numFour(cool.get(3)));
        System.out.println(middleNum(cool.get(4)));

    }

}
