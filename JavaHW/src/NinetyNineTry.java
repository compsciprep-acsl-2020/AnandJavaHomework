import java.util.*;
import java.lang.*;
import java.io.*;


public class NinetyNineTry {




    public static void main(String[]Args) throws IOException{
        int i = 0;
        File file = new File("C:\\Users\\Anand Vinod\\Desktop\\input.txt");
        Scanner s = new Scanner(file);
        while(s.hasNextLine()&& i <5){


            String test = s.nextLine();
            String[] ap = test.split(", ");
            String[] in = removeSpace(ap);

            for(int a = 0; a< in.length; a++ ){

                in[a] = Integer.toString(guide(in[a]));

            }

            int init = Integer.valueOf(in[0].trim());
            ArrayList<String> hand = new ArrayList<String>();
            ArrayList<String> dealer = new ArrayList<String>();
            hand.add(in[1]);
            hand.add(in[2]);
            hand.add(in[3]);



            boolean flag  = false;
            i++;

            while(init < 99){

                int a = getMax(hand);

                init += specialVals(a,init);

                if(init>99) {
                    break;
                }

                hand.remove(hand.indexOf(Integer.toString(getMax(hand))));

                hand.add(in[4]);



                flag = true;

                init += specialVals(Integer.parseInt(in[5]) , init);

                if(init>99)
                break;

                flag = false;

                a = getMax(hand);


                init += specialVals(a,init);



                if(init> 99)

                    break;

                hand.remove(hand.indexOf(Integer.toString(getMax(hand))));

                hand.add(in[6]);

                flag = true;

                init += specialVals(Integer.parseInt(in[7]),init);

                if(init > 99)

                    break;

                flag = false;

                a = getMax(hand);
                init +=  specialVals(a, init);

                if(init > 99)
                    break;

                hand.remove(hand.indexOf(Integer.toString(getMax(hand))));

                hand.add(in[8]);

                flag = true;

                init += specialVals(Integer.parseInt(in[9]), init);

                if(init>99)
                    break;

                flag = false;

                a = getMax(hand);

                init += specialVals(a, init);


            }
            if(flag)
            System.out.println(init + ", Player" );
            else
             System.out.println(init + ", Dealer");
        }

    }
    public static int getMax(ArrayList<String> a) {
        int max = Integer.valueOf(a.get(0).trim());
        for (int i = 0; i < a.size(); i++) {

            max = Math.max(max, Integer.valueOf(a.get(i).trim()));
        }

        return max;

    }
    public static int guide(String b){
        String a = b.trim();
        if(a.equals("T")){

            return 10;
        }
        else if(a.equals("J")){
            return 11;
        }
        else if(a.equals("Q")){
            return 12;
        }
        else if(a.equals("K")){
            return 13;
        }
        else if(a.equals("A")){

                return 14;

        }
        return Integer.valueOf(a);
    }
    public static int specialVals(int a, int sum){
        int b;
        switch(a){

            case 9: b= 0; break;
            case 10: b= -10; break;
            case 14:
                if(sum + 14 <= 99)
                b = 14;
                else
                b= 1;
                break;
            default: b = a;
        }
        return b;

        }


    public static String[] removeSpace(String[] in){
        String[] ret = new String[in.length];

        for(int i = 0; i< in.length; i++){

            ret[i] = in[i].trim();

        }

        return ret;
    }
}




