import java.util.*;


public class Rotation {

    public static void rotate(int [] thing){

        int [] sample = thing;
        int a = sample[0];
        int b = sample[1];
        int c = sample[2];

        ArrayList<Integer> test = new ArrayList<Integer>();

        test.add(b);
        test.add(c);
        test.add(a);
        System.out.println(test);
    }
    public static void main(String[]Args){
        int [] bruh = {5,11,9};
        rotate(bruh);
    }
}
