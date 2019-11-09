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
    public static boolean num3(int [] delta){
        boolean count = false;
        boolean countSpace = false;
        for(int i = 0; i<delta.length-2 && delta.length>=3; i++){
            if(delta[i]==3 && delta[i+1]==3 && delta[i+2]==3){

                countSpace = true;
                count = true;
            }


        }
        if(count && countSpace){
            return true;
        }
        return false;
    }
    public static void main(String[]Args){
        int [] bruh = {3,3,3,6,6,6,3,4,5};
        rotate(bruh);
        System.out.println(num3(bruh));
    }
}
